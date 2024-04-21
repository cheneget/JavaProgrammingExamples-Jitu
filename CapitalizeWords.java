/*Write a program that accepts a string as input, capitalizes the first letter of each word in the
string, and then returns the result string.*/

import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Continuously prompt the user for input until they choose to exit
        while (true) {
            System.out.print("Enter a string (or enter 'exit' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user enters "exit"
            }
            
            String capitalizedString = capitalizeWords(input);
        
            System.out.println("Capitalized string: " + capitalizedString);
        }
        
        scanner.close();
    }
    
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder result = new StringBuilder();
        
        // Split the input string by space into an array of words
        String[] words = input.split("\\s+");
        
        for (String word : words) {
            // Capitalize the first letter of each word and append it to the result
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1))
                  .append(" ");
        }
        
        // Remove the trailing space and return the capitalized string
        return result.toString().trim();
    }
}

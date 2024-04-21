/*Write a program that takes an integer as input and returns an integer with reversed digit
ordering.
Examples:
For input 500, the program should return 5.
For input -56, the program should return -65.
For input -90, the program should return -9.
For input 91, the program should return 19.*/

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Continuously prompt the user for input until they choose to exit
        while (true) {
            System.out.print("Enter an integer (or enter 'exit' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user enters "exit"
            }
            
            try {
                int num = Integer.parseInt(input); // Convert user input to an integer
                
                int reversedNum = reverseInteger(num);
        
                System.out.println("Reversed integer: " + reversedNum);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        scanner.close();
    }
    
    public static int reverseInteger(int num) {
        int reversedNum = 0;
        
        while (num != 0) {
            int digit = num % 10; // Get the rightmost digit
            reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the rightmost digit from the original number
        }
        
        return reversedNum;
    }
}

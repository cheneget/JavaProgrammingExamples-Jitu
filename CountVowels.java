import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Continuously prompt the user for input until they choose to exit
        while (true) {
            System.out.print("Enter a sentence (or enter 'exit' to quit): ");
            String sentence = scanner.nextLine();
            
            // Check if the user wants to exit
            if (sentence.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user enters "exit"
            }
            
            int vowelCount = countVowels(sentence);
        
            System.out.println("Number of vowels: " + vowelCount);
        }
        
        scanner.close();
    }
    
    public static int countVowels(String sentence) {
        boolean[] visited = new boolean[26]; // To track if a vowel has been counted
        
        int count = 0;
        // Convert the sentence to lowercase to simplify the counting process
        sentence = sentence.toLowerCase();
        
        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            // Check if the character is a vowel excluding spaces
            if (ch >= 'a' && ch <= 'z') {
                // Check if the vowel has not been counted before
                if (!visited[ch - 'a'] && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    count++;
                    visited[ch - 'a'] = true;
                }
            }
        }
        
        return count;
    }
}

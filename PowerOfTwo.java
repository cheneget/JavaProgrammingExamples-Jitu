//Write a program that takes an integer as input and returns true if the input is a power of two.

import java.util.Scanner;

public class PowerOfTwo {
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
                boolean result = isPowerOfTwo(num);
                
                if (result) {
                    System.out.println(num + " is a power of two.");
                } else {
                    System.out.println(num + " is not a power of two.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        scanner.close();
    }
    
    public static boolean isPowerOfTwo(int n) {
        // A power of two will have only one bit set in its binary representation
        // So if we subtract 1 from a power of two, all bits to the right of the only set bit will be set to 1
        // For example, 8 (1000) - 1 = 7 (0111)
        // So, performing bitwise AND of n and n-1 will result in 0 if n is a power of two
        return n > 0 && (n & (n - 1)) == 0;
    }
}

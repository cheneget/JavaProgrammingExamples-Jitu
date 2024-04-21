/*Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for
 multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print
 "FizzBuzz".*/

public class FizzBuzz {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 100
        for (int num = 1; num <= 100; num++) {
            // Check if the number is divisible by both 3 and 5
            if (num % 3 == 0 && num % 5 == 0) {
                // If yes, print "FizzBuzz"
                System.out.println("FizzBuzz");
            }
            // Check if the number is divisible by 3 but not by 5
            else if (num % 3 == 0) {
                // If yes, print "Fizz"
                System.out.println("Fizz");
            }
            // Check if the number is divisible by 5 but not by 3
            else if (num % 5 == 0) {
                // If yes, print "Buzz"
                System.out.println("Buzz");
            }
            // If the number is not divisible by either 3 or 5
            else {
                // Print the number itself
                System.out.println(num);
            }
        }
    }
}

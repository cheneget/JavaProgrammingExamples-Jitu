// Question: Write a program to generate the Fibonacci sequence up to 100.

public class FibonacciSequence {
    public static void main(String[] args) {
        int maxNumber = 100;
        int previousNumber = 0;
        int currentNumber = 1;
        
        System.out.println("Fibonacci sequence up to " + maxNumber + ":");
        
        while (previousNumber <= maxNumber) {
            System.out.print(previousNumber + " ");
            int nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
    }
}

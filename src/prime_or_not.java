import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Handle edge cases
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // Check for divisibility up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Number is divisible by i, so it's not prime
            }
        }

        return true; // Number is prime
    }
}

/*Create a program that checks if a given string is a palindrome (reads the same
forwards and backwards). */
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Function call to check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to ignore case sensitivity
        str = str.toLowerCase();

        // Initialize two pointers, one at the beginning and the other at the end
        int left = 0;
        int right = str.length() - 1;

        // Check if characters from both ends match
        while (left < right) {
            // If characters at the current positions are not equal, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // Move the pointers towards the center
            left++;
            right--;
        }

        // If all characters match, it's a palindrome
        return true;
    }
}

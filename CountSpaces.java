import java.util.Scanner;

public class CountSpaces {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); // Read the input string

        // Initialize a counter to keep track of spaces
        int spaceCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < userInput.length(); i++) {
            // Extract each character using charAt() method
            char currentChar = userInput.charAt(i);

            // Check if the character is a space
            if (currentChar == ' ') {
                spaceCount++; // Increment the counter if it's a space
            }
        }

        // Display the total number of spaces
        System.out.println("Number of spaces in the string: " + spaceCount);

        // Close the scanner object to release resources
        scanner.close();
    }
}

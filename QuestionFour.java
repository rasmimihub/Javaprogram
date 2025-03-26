import java.util.Scanner;

public class    QuestionFour {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String userIn = sc.nextLine(); // Read the input string

        // Initialize a counter to keep track of spaces
        int spcCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < userIn.length(); i++) {
            // Extract each character using charAt() method
            char currentChar = userIn.charAt(i);

            // Check if the character is a space
            if (currentChar == ' ') {
                spcCount++; // Increment the counter if it's a space
            }
        }

        // Display the total number of spaces
        System.out.println("Number of spaces in the string: " + spcCount);

        // Close the scanner object to release resources
        sc.close();
    }
}

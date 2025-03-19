import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); // Read the string from the user

        // 1. Display the length of the string
        int length = userInput.length();
        System.out.println("Length of the string: " + length);

        // 2. Display the string in uppercase
        String upperCaseVersion = userInput.toUpperCase();
        System.out.println("Uppercase version: " + upperCaseVersion);

        // 3. Check if the string contains "BCA"
        boolean containsBCA = userInput.contains("BCA");
        System.out.println("Does the string contain 'BCA'? " + containsBCA);

        // 4. Append "2023" to the string using StringBuffer
        StringBuffer stringBuffer = new StringBuffer(userInput); // Create a StringBuffer object
        stringBuffer.append("2023"); // Append "2023" to the string
        System.out.println("String after appending '2023': " + stringBuffer.toString());

        // Close the scanner object to release resources
        scanner.close();
    }
}

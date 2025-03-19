import java.util.Scanner;

public class ReplaceAndReverse {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); // Read the string from the user

        // Replace all occurrences of "hi" with "hello"
        String replacedString = userInput.replace("hi", "hello");
        System.out.println("String after replacing 'hi' with 'hello': " + replacedString);

        // Reverse the resulting string using StringBuffer
        StringBuffer stringBuffer = new StringBuffer(replacedString);
        stringBuffer.reverse(); // Reverse the string
        System.out.println("Reversed string: " + stringBuffer.toString());

        // Close the scanner object to release resources
        scanner.close();
    }
}

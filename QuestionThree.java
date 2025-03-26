import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner myObj1 = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String userIn = myObj1.nextLine(); // Read the string from the user

        // Replace all occurrences of "hi" with "hello"
        String replacedString = userIn.replace("hi", "hello");
        System.out.println("String after replacing 'hi' with 'hello': " + replacedString);

        // Reverse the resulting string using StringBuffer
        StringBuffer bufferObj1 = new StringBuffer(replacedString);
        bufferObj1.reverse(); // Reverse the string
        System.out.println("Reversed string: " + bufferObj1 .toString());

        // Close the scanner object to release resources
        myObj1.close();
    }
}

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner obj1 = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String userIn = obj1.nextLine(); // Read the string from the user

        // 1. Display the length of the string
        int length = userIn.length();
        System.out.println("Length of the string: " + length);

        // 2. Display the string in uppercase
        String upperCase = userIn.toUpperCase();
        System.out.println("Uppercase version: " + upperCase);

        // 3. Check if the string contains "BCA"
        boolean containsBCA = userIn.contains("BCA");
        System.out.println("Does the string contain 'BCA'? " + containsBCA);

        // 4. Append "2023" to the string using StringBuffer
        StringBuffer buffer1 = new StringBuffer(userIn); // Create a StringBuffer object
        buffer1.append("2023"); // Append "2023" to the string
        System.out.println("String after appending '2023': " + buffer1.toString());

        // Close the scanner object to release resources
        obj1.close(); 
    }
}

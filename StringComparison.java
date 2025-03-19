import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the first string
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        // Ask the user to input the second string
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // 1. Compare the two strings using equals()
        boolean areEqual = string1.equals(string2);
        System.out.println("Are the two strings equal (using equals())? " + areEqual);

        // 2. Compare the two strings using compareTo()
        int comparisonResult = string1.compareTo(string2);
        if (comparisonResult == 0) {
            System.out.println("The two strings are equal (using compareTo()).");
        } else if (comparisonResult < 0) {
            System.out.println("The first string is lexicographically smaller than the second string.");
        } else {
            System.out.println("The first string is lexicographically greater than the second string.");
        }

        // 3. Display the first 2 characters of the shorter string
        String shorterString = (string1.length() < string2.length()) ? string1 : string2;
        if (shorterString.length() >= 2) {
            System.out.println("The first 2 characters of the shorter string: " + shorterString.substring(0, 2));
        } else {
            System.out.println("The shorter string is too short to display 2 characters.");
        }

        // Close the scanner object to release resources
        scanner.close();
    }
}

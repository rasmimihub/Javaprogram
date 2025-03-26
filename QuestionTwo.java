import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner myObj1 = new Scanner(System.in);

        // Ask the user to input the first string
        System.out.print("Enter the first string : ");
        String string1 = myObj1.nextLine();

        // Ask the user to input the second string
        System.out.print("Enter the second string: "); 
        String string2 = myObj1.nextLine();

        // 1. Compare the two strings using equals()
        boolean booObj1 = string1.equals(string2);
        System.out.println("Are the two strings equal ? " + booObj1);

        // 2. Compare the two strings using compareTo()
        int compObj = string1.compareTo(string2);
        if (compObj == 0) {
            System.out.println("The two strings are equal.");
        } else if (compObj < 0) {
            System.out.println("The first string is alphabetically smaller than the second string.");
        } else {
            System.out.println("The first string is alphabetically greater than the second string.");
        }

        // 3. Display the first 2 characters of the shorter string
        String shorterObj = (string1.length() < string2.length()) ? string1 : string2;
        if (shorterObj.length() >= 2) {
            System.out.println("The first 2 characters of the shorter string: " + shorterObj.substring(0, 2));
        } else {
            System.out.println("The shorter string is too short to display 2 characters.");
        }

        // Close the scanner object to release resources
        myObj1.close();
    }
}

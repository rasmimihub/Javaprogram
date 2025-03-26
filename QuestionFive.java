import java.util.Scanner;

public class QuestionFive{
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine(); // Read the input sentence

        // Split the sentence into words using split()
        String[] words = sentence.split(" "); // Split by spaces

        // Use StringBuffer to join the words with underscores
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]); // Add the word to the StringBuffer
            // Add an underscore after the word, but not after the last one
            if (i < words.length - 1) {
                result.append("_");
            }
        }

        // Display the resulting string
        System.out.println("Sentence after joining with underscores: " + result.toString());

        // Close the scanner to release resources
        sc.close();
    }
}

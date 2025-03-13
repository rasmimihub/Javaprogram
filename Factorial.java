import java.util.Scanner;

public class Factorial {

    // Recursive method to find the factorial of a number
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a no. to find its factorial: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        scanner.close();
    }
}

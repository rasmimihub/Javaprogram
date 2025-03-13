import java.util.Scanner;
public class AndOrNot {
    public static void main(String[] agrs)
    {
        //making scanner object
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter the number 2:");
        int num2=sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of num1 and num2 is: " + sum);
    }
}
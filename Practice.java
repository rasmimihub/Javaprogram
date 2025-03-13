//program to convert string to integer;(type casting to convert one dt into another dt)
import java.util.Scanner;
class Practice {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Put any string value: ");
        String input = scan.nextLine();
        int number = Integer.parseInt(input);
        System.out.println("Into integer: " + number);
        scan.close();
    }
}
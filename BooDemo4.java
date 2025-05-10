import java.util.Scanner;
public class BooDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Boolean value (true/false): ");
        String input1 = sc.nextLine();
        System.out.println("Enter 2nd value (true/false): ");
        String input2 = sc.nextLine();
        Boolean bool1 = Boolean.valueOf(input1);
        Boolean bool2 = Boolean.valueOf(input2);
        Boolean result = bool1 && bool2;
        System.out.println("logical AND result: " + result);
        sc.close();
     
}
}


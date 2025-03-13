//program to remove all whitespaces from the string
import java.util.Scanner;
class Name {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string with white space:  ");
    String input = scan.nextLine();
    String noSpace = input.replaceAll("\\s", "");
    System.out.println("String without white spaces: " + noSpace);
    scan.close();
  }
}

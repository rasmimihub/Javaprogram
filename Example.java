import java.util.Scanner;
class Example {
    public static void main(String args[])
    {
    Scanner name=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=name.nextInt();
    if(num%2==0)
    {
        System.out.println("Number is Even" );
    }
    else
    {
        System.out.println("Number is Odd.");
    }
}
}
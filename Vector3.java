import java.util.Scanner;
import java.util.Hashtable;
import java.util.Map;
public class Vector3 {
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);
        Hashtable<String, Integer> stuMarks = new Hashtable<>();
        System.out.println("Enter 3 student name and their marks: ");
        for (int i = 0; i <3; i++) {
            System.out.println("Enter student name" + (i+1) + ": ");
            String name = sc.nextLine();
            System.out.println("Enter marks for " +name + ": ");
            int marks = sc.nextInt();
            sc.nextLine();
            stuMarks.put(name, marks);
        }
        System.out.println("Stored Student marks:");
        for (Map.Entry<String, Integer> entry :
            stuMarks.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Marks:" + entry.getValue());
            }
            sc.close();

    }
    
}

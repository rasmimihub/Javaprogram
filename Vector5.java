import java.util.Vector;
import java.util.Enumeration;
public class Vector5 {
    public static void main(String[] args){
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        Enumeration<Integer> e = numbers.elements();
        System.out.println("Vector elements:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
    
}

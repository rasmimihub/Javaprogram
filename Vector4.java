import java.util.Random;
public class Vector4 {
    public static void main(String[] args) {
        Random r = new Random();
        int r1 = r.nextInt(100) + 1;
        double r2 = r.nextDouble();
        System.out.println("Random Integer (1 to 100): " + r1);
        System.out.println("Random Double (0.0 to 1.0): " + r2);
    }
    
}

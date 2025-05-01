class Pen {}
class Paper {}

class Student1 extends Thread {
    private Pen pen;
    private Paper paper;

    public Student1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    public void run() {
        synchronized (pen) {
            System.out.println("Student 1 has Pen, waiting for Paper...");
            try { Thread.sleep(100); } catch (InterruptedException e) {}

            synchronized (paper) {
                System.out.println("Student 1 got Paper!");
            }
        }
    }
}

class Student2 extends Thread {
    private Pen pen;
    private Paper paper;

    public Student2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    public void run() {
        synchronized (paper) {
            System.out.println("Student 2 has Paper, waiting for Pen...");
            try { Thread.sleep(100); } catch (InterruptedException e) {}

            synchronized (pen) {
                System.out.println("Student 2 got Pen!");
            }
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Pen sharedPen = new Pen();
        Paper sharedPaper = new Paper();

        Student1 writer1 = new Student1(sharedPen, sharedPaper);
        Student2 writer2 = new Student2(sharedPen, sharedPaper);

        writer1.start();
        writer2.start();
    }
}
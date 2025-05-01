class Desk {
    private int paper;
    private boolean hasPaper = false;

    public synchronized void putPaper(int value) {
        while (hasPaper) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        paper = value;
        hasPaper = true;
        System.out.println("Student placed Paper: " + paper);
        notify();
    }

    public synchronized void takePaper() {
        while (!hasPaper) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        System.out.println("Teacher took Paper: " + paper);
        hasPaper = false;
        notify();
    }
}

class Student1 implements Runnable {
    private Desk desk;

    public Student1(Desk desk) {
        this.desk = desk;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            desk.putPaper(i);
        }
    }
}

class Teacher implements Runnable {
    private Desk desk;

    public Teacher(Desk desk) {
        this.desk = desk;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            desk.takePaper();
        }
    }
}

public class ExamHall {
    public static void main(String[] args) {
        Desk sharedDesk = new Desk();

        Thread studentThread = new Thread(new Student1(sharedDesk));
        Thread teacherThread = new Thread(new Teacher(sharedDesk));

        studentThread.start();
        teacherThread.start();
    }
}
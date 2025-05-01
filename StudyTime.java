class Num1to5 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

class Num10to6 extends Thread {
    public void run() {
        for (int i = 10; i >= 6; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

public class StudyTime {
    public static void main(String[] args) {
        Num1to5 easyCount = new Num1to5();
        Num10to6 trickyCount = new Num10to6();

        easyCount.setPriority(Thread.MIN_PRIORITY);
        trickyCount.setPriority(Thread.MAX_PRIORITY);

        easyCount.start();
        trickyCount.start();
    }
}
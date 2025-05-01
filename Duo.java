class Alpha extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

class Beta extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

public class Duo {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        Beta b = new Beta();

        a.start();
        b.start();
    }
}

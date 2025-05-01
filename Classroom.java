class Notebook {
    private int count = 0;

    public synchronized void addNote() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Student implements Runnable {
    private Notebook notebook;

    public Student(Notebook notebook) {
        this.notebook = notebook;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            notebook.addNote();
        }
    }
}

public class Classroom {
    public static void main(String[] args) {
        Notebook sharedNotebook = new Notebook();

        Student learner1 = new Student(sharedNotebook);
        Student learner2 = new Student(sharedNotebook);

        Thread t1 = new Thread(learner1);
        Thread t2 = new Thread(learner2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Notebook Entry Count: " + sharedNotebook.getCount());
    }
}
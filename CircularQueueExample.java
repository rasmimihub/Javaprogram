public class CircularQueueExample {

    // CircularQueue class definition
    static class CircularQueue {
        private int[] queue; // Array to store the elements of the queue
        private int front, rear, size; // Variables to keep track of the front, rear, and size of the queue

        // Constructor to initialize the queue with a given size
        public CircularQueue(int size) {
            this.size = size;
            this.queue = new int[size];
            this.front = -1;
            this.rear = -1;
        }

        // Method to check if the queue is full
        public boolean isFull() {
            return (front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1));
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return front == -1;
        }

        // Method to add an element to the queue
        public void enqueue(int element) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            queue[rear] = element;
        }

        // Method to remove and return the front element from the queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int element = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return element;
        }

        // Method to return the front element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return queue[front];
        }
    }

    // Main method to demonstrate the CircularQueue usage
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5); // Create a circular queue with size 5

        // Add elements to the queue
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        // Remove and print an element from the queue
        System.out.println("Dequeued element: " + cq.dequeue());

        // Print the front element
        System.out.println("Front element: " + cq.peek());

        // Add another element to the queue
        cq.enqueue(60);

        // Remove and print all elements from the queue
        while (!cq.isEmpty()) {
            System.out.println("Dequeued element: " + cq.dequeue());
        }
    }
}


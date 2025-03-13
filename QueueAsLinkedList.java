class Node {
    int data;
    Node next;

    // Constructor to initialize a node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueAsLinkedList {
    Node front, rear;

    // Constructor to initialize an empty queue
    QueueAsLinkedList() {
        this.front = this.rear = null;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // If the queue is empty, then the new node becomes both the front and rear
        if (rear == null) {
            front = rear = newNode;
            System.out.println(data + " enqueued to queue");
            return;
        }

        // Add the new node at the end of the queue and change the rear
        rear.next = newNode;
        rear = newNode;
        System.out.println(data + " enqueued to queue");
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int dequeued = front.data;
        front = front.next;

        // If the front becomes null, then change rear to null
        if (front == null) {
            rear = null;
        }

        return dequeued;
    }

    // Method to get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        return front.data;
    }

    // Method to print the queue elements
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node currentNode = front;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueAsLinkedList queue = new QueueAsLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue(); // Output: 10 20 30 

        System.out.println(queue.dequeue() + " dequeued from queue"); // Output: 10 dequeued from queue

        queue.printQueue(); // Output: 20 30 

        System.out.println("Front element is " + queue.peek()); // Output: Front element is 20
    }
}

public class Queue {
    int maxSize = 5;
    int front = 0;
    int rear = -1;
    int[] arr = new int[maxSize];
    
    public void enqueue(int number) {
        if (isFull()) {
            System.out.println("Queue overflow");
        } else {
            rear = (rear + 1) % maxSize;
            arr[rear] = number;
        }
    }
    
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
        } else {
            System.out.println(arr[front] + "");
            front = (front + 1) % maxSize;
        }
    }
    
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Elements in queue:");
            for (int i = front; i != rear; i = (i + 1) % maxSize) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[rear]);
        }
        System.out.println("");
    }
    
    public boolean isEmpty() {
        return (rear + 1) % maxSize == front;
    }
    
    public boolean isFull() {
        return (rear + 2) % maxSize == front;
    }
       
    public void peek() {
        if (!isEmpty()) {
            System.out.println(arr[front]);
        } else {
            System.out.println("No elements in queue");
        }
    }
    
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enqueue(15);
        myQueue.enqueue(20);
        myQueue.enqueue(25);
        myQueue.show();
        myQueue.dequeue();
        myQueue.show();
        myQueue.peek();
    }
}


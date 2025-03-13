class Node {
    int data;
    Node next;

    // Constructor to initialize a node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackAsLinkedList {
    Node top;

    // Constructor to initialize an empty stack
    StackAsLinkedList() {
        this.top = null;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to push an element to the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to stack");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return top.data;
    }

    // Method to print the stack elements
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node currentNode = top;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackAsLinkedList stack = new StackAsLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack(); // Output: 30 20 10 

        System.out.println(stack.pop() + " popped from stack"); // Output: 30 popped from stack

        stack.printStack(); // Output: 20 10 

        System.out.println("Top element is " + stack.peek()); // Output: Top element is 20
    }
}

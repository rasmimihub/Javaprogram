// CircularNode class to represent each element in the circular linked list
class CircularNode {
    int data;
    CircularNode next;

    // Constructor to initialize the node with data
    public CircularNode(int data) {
        this.data = data;
        this.next = null;
    }
}

// CircularLinkedList class to manage the linked list operations
public class CircularLinkedList {
    CircularNode head;

    // Method to add a node at the end of the list
    public void add(int data) {
        CircularNode newNode = new CircularNode(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            head.next = head; // Point the node to itself
            return;
        }

        // Traverse to the end of the list
        CircularNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        // Add the new node at the end of the list
        temp.next = newNode;
        newNode.next = head; // Link the new node to the head
    }

    // Method to insert a node at a specific position
    public void insert(int data, int position) {
        CircularNode newNode = new CircularNode(data);

        // If inserting at the head
        if (position == 0) {
            if (head == null) {
                head = newNode;
                head.next = head;
                return;
            }
            CircularNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            head = newNode;
            temp.next = head;
            return;
        }

        // Traverse to the position
        CircularNode temp = head;
        for (int i = 0; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method to delete a node at a specific position
    public void delete(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If deleting the head node
        if (position == 0) {
            if (head.next == head) {
                head = null;
                return;
            }
            CircularNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
            return;
        }

        // Traverse to the position
        CircularNode temp = head;
        for (int i = 0; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        // Delete the node
        if (temp.next == head) {
            System.out.println("Invalid position.");
            return;
        }
        temp.next = temp.next.next;
    }

    // Method to display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        CircularNode temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Main method to test the circular linked list implementation
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        // Add elements to the list
        cll.add(10);
        cll.add(20);
        cll.add(30);
        cll.add(40);

        // Display the list
        System.out.println("Circular Linked List:");
        cll.display();

        // Insert an element at position 2
        cll.insert(25, 2);
        System.out.println("After inserting 25 at position 2:");
        cll.display();

        // Delete the element at position 3
        cll.delete(3);
        System.out.println("After deleting the element at position 3:");
        cll.display();
    }
}

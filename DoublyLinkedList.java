// Node class representing each element of the doubly linked list
class Node {
    int data;
    Node prev;
    Node next;

    // Constructor to create a new node with given data
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

// DoublyLinkedList class containing operations for the list
public class DoublyLinkedList {
    Node head;
    Node tail;

    // Constructor to initialize an empty list
    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method to add a node at the end of the list
    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // If the list is empty, head and tail point to the new node
            head = tail = newNode;
        } else {
            // Add the new node at the end and update tail
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method to insert a node at the beginning of the list
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Method to insert a node at a specified position
    void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            // If position is greater than the length of the list, append at the end
            addNode(data);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    // Method to display the list from head to tail
    void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to display the list from tail to head
    void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Method to delete a node from the list given its data
    void deleteNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                // If node to be deleted is the head node
                if (current == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }
                // If node to be deleted is the tail node
                else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                }
                // If node to be deleted is in the middle
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
        // Print a message if the element is not found
        System.out.println("Element not found.");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Adding nodes to the list
        dll.addNode(10);
        dll.addNode(30);

        // Inserting at the beginning
        dll.insertAtBeginning(0);
        System.out.print("List after inserting 0 at the beginning: ");
        dll.displayForward();

        // Inserting at position 1 (between 0 and 10)
        dll.insertAtPosition(5, 1);
        System.out.print("List after inserting 5 at position 1: ");
        dll.displayForward();

        // Inserting at position 4 (end of the list)
        dll.insertAtPosition(40, 4);
        System.out.print("List after inserting 40 at the end: ");
        dll.displayForward();

        // Delete a node and display the list again
        dll.deleteNode(30);
        System.out.print("List after deleting 30: ");
        dll.displayForward();

        // Attempt to delete a non-existent node
        dll.deleteNode(50); // This will print "Element not found."
        System.out.print("List after attempting to delete 50: ");
        dll.displayForward();
    }
}

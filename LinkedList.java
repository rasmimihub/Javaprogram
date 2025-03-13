// Node class to represent each element in the Linked List
class Node {
    int data; // Data part of the Node
    Node next; // Pointer to the next Node in the list

    // Constructor to create a new Node with the given data
    Node(int data) {
        this.data = data;
        this.next = null; // Initially, the next is null
    }
}

// LinkedList class to manage the list
public class LinkedList {
    Node head; // Head (or first) Node of the list

    // Method to insert a new Node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data); // Create a new Node
        if (head == null) {
            head = newNode; // If the list is empty, make the new Node the head
        } else {
            Node temp = head;
            while (temp.next != null) { // Traverse to the end of the list
                temp = temp.next;
            }
            temp.next = newNode; // Add the new Node at the end
        }
    }

    // Method to delete a Node by its value
    public void delete(int data) {
        if (head == null) { // If the list is empty, nothing to delete
            System.out.println("List is empty.");
            return;
        }

        // If the head node itself holds the key to be deleted
        if (head.data == data) {
            head = head.next; // Change the head
            return;
        }

        // Search for the key to be deleted
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        // If the key was not present in the list
        if (temp.next == null) {
            System.out.println("Element not found.");
            return;
        }

        // Unlink the node from the linked list
        temp.next = temp.next.next;
    }

    // Method to display the list
    public void display() {
        Node temp = head;
        while (temp != null) { // Traverse the list
            System.out.print(temp.data + " "); // Print the data of each Node
            temp = temp.next; // Move to the next Node
        }
        System.out.println(); // Print a new line at the end
    }

    // Main method to test the LinkedList class
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new LinkedList

        // Insert elements to the list
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        // Display the list
        System.out.print("List after insertion: ");
        list.display(); // Output: 1 2 3 4

        // Delete an element from the list
        list.delete(3);
        System.out.print("List after deleting 3: ");
        list.display(); // Output: 1 2 4

        // Try to delete an element not in the list
        list.delete(5); // Output: Element not found.
        System.out.print("List after attempting to delete 5: ");
        list.display(); // Output: 1 2 4
    }
}

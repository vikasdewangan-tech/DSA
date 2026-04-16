class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class LinkedList {

    Node head = null;

    // Insert at end
    void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Delete first node
    void delete() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println(head.data + " deleted");
            head = head.next;
        }
    }

    // Display
    void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();

        list.delete();

        list.display();
    }
}

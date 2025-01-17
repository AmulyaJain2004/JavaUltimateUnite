class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head = null;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(int index, int data) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        int currentIndex = 0;
        Node current = head;
        Node newNode = new Node(data);

        while (current != null) {
            if (currentIndex == index) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
            currentIndex++;
        }

        System.out.println("Index out of bounds.");
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteNode(int key) {
        if (head == null)
            return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("none");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insertAtBeginning(5);
        linkedList.insert(15);
        linkedList.printList();
        linkedList.insertAfter(1, 20); // Insert after index 1
        linkedList.printList();
        linkedList.deleteNode(15);
        linkedList.printList();
    }
}

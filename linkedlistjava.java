class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head, tail;

    public void insert(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");  
    }

    public void insertBeg(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void insertAt(int pos, int data) {
        Node n = new Node(data);
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }

    public void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void delete(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        if (pos == 0) {
            head = head.next;
            return;
        }

        for (int i = 0; i < pos - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Position out of bounds");
                return;
            }
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }
}

public class linkedlistjava {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(20);

        ll.insertBeg(100);  
        ll.display();  

        ll.insertAt(3, 555);
        ll.display();  

        System.out.println("Delete at begin");
        ll.deleteAtBegin();
        ll.display();

        ll.delete(2);
        ll.display();
    }
}

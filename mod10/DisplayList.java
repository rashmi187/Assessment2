package mod10;
public class DisplayList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DisplayList list = new DisplayList();

        list.head = list.new Node(10);
        list.head.next = list.new Node(20);
        list.head.next.next = list.new Node(30);

        list.display();
    }
}

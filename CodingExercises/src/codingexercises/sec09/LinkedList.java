package codingexercises.sec09;

public class LinkedList {
    Node head;

    LinkedList(){
        this.head = null;
    }

    LinkedList(Node head) {
        this.head = head;
    }

    public static void reverseList(LinkedList list){
        Node previous = null;
        Node current = list.head;
        Node following;
        while (current != null){
            following = current.next;
            current.next = previous;
            previous = current;
            current = following;
        } list.head = previous;
        }
}

package codingexercises.sec11;

public class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    LinkedList(Node head) {
        this.head = head;
    }

    public static int length(LinkedList list) {
        int length;
        if (list.head == null) {
            length = 0;
        } else {
            Node temp = list.head;
            length = 1;
            while (temp.next != null) {
                temp = temp.next;
                length++;
            }
        } return length;
    }


    public static boolean isPalindromeList(LinkedList list) {
        int length;
        if (list.head == null) {
            length = 0;
        } else {
            Node temp = list.head;
            length = 1;
            while (temp.next != null) {
                temp = temp.next;
                length++;
            }
        }

        Node left = list.head;
        for (int i = 0; i < length / 2; i++) {
            Node right = list.head;
            for (int j = 0; j < length - 1 - i; j++) {
                right = right.next;
            }
            if (left.data != right.data) return false;
            left = left.next;
        } return true;
    }
}

/*
Given a linked list of integers list, create a function that
reverses it in-place without using an additional data structure.
*/

package codingexercises.sec09;
public class Main {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList(new Node(5));
        myList.head.next = new Node(3);
        myList.head.next.next = new Node(6);
        myList.head.next.next.next = new Node(4);
        myList.head.next.next.next.next = new Node(7);

        LinkedList.reverseList(myList);
    }
}

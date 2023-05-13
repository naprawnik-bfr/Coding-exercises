/*
Given a linked list of integers list, create a boolean function
that checks if it's a palindrome linked list in constant space complexity.
*/

package codingexercises.sec11;

public class Main {

    public static void main(String[] args) {



        LinkedList myList1 = new LinkedList(new Node(1));
        myList1.head.next = new Node(4);
        myList1.head.next.next = new Node(6);
        myList1.head.next.next.next = new Node(5);
        myList1.head.next.next.next.next = new Node(6);
        myList1.head.next.next.next.next.next = new Node(4);
        myList1.head.next.next.next.next.next.next = new Node(1);

        LinkedList myList2 = new LinkedList(new Node(8));
        myList2.head.next = new Node(3);
        myList2.head.next.next = new Node(1);
        myList2.head.next.next.next = new Node(8);

        LinkedList myList3 = new LinkedList(new Node(6));


        System.out.println(LinkedList.isPalindromeList(myList1));
        System.out.println(LinkedList.length(myList1));
        System.out.println(LinkedList.isPalindromeList(myList2));
        System.out.println(LinkedList.length(myList2));
        System.out.println(LinkedList.isPalindromeList(myList3));
        System.out.println(LinkedList.length(myList3));
    }
}

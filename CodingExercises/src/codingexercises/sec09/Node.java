package codingexercises.sec09;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node (int data, Node next){
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}


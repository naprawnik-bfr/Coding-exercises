/*Given a binary tree of integers root, create a function that reverses it left to right in-place.*/

package codingexercises.sec07;

public class Main {
    public static void main(String[] args) {
        Tree treeOne = new Tree(1,
                new Tree(2, new Tree(4), new Tree(5)),
                new Tree(3, new Tree(6), new Tree(7)));

        Tree.reverseTree(treeOne);


        Tree treeTwo = new Tree(6);
        treeTwo.left = new Tree(8);
        treeTwo.right = new Tree(13);
        treeTwo.left.left = new Tree(2);
        treeTwo.left.right = new Tree(1);
        treeTwo.left.left.left = new Tree(7);
        treeTwo.right.left = new Tree(5);

        System.out.println();
        Tree.reverseTree(treeTwo);

    }
}


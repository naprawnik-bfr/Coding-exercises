/*Given a binary tree of integers root, create 3 functions to print the tree nodes in preorder, inorder, and postorder traversal.
        Preorder: print the root value, then print the left subtree, then print the right subtree.
        Inorder: print the left subtree, then print the root value, then print the right subtree.
        Postorder: print the left subtree, then print the right subtree, then print the root value.*/

package codingexercises.sec05;

public class Main {
    public static void main(String[] args) {
        Tree treeOne = new Tree(1,
                new Tree(2, new Tree(4), new Tree(5)),
                new Tree(3, new Tree(6), new Tree(7)));

        Tree.dfsPreorder(treeOne);
        System.out.println();
        Tree.dfsInorder(treeOne);
        System.out.println();
        Tree.dfsPostorder(treeOne);
        System.out.println();

        Tree treeTwo = new Tree(6);
        treeTwo.left = new Tree(8);
        treeTwo.right = new Tree(13);
        treeTwo.left.left = new Tree(2);
        treeTwo.left.right = new Tree(1);
        treeTwo.left.left.left = new Tree(7);
        treeTwo.right.left = new Tree(5);

        System.out.println();
        Tree.dfsPreorder(treeTwo);
        System.out.println();
        Tree.dfsInorder(treeTwo);
        System.out.println();
        Tree.dfsPostorder(treeTwo);
        System.out.println();
    }
}


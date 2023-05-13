package codingexercises.sec07;

// Time complexity: O(n)
// Space complexity: O(h)

class Tree{
    int data;
    Tree left;
    Tree right;

    Tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Tree(int data, Tree left, Tree right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /*
    PreOrder:
         1
       /   \
      2     5
     / \   / \
    3   4 6   7
    */
    public static void reverseTree(Tree root){
        if(root == null) return;
        System.out.print(root.data + " ");
        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;
        reverseTree(root.left);
        reverseTree(root.right);
    }
}
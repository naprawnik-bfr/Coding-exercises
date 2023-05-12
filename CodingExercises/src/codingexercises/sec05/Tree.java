package codingexercises.sec05;

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
    static void dfsPreorder(Tree root){
        if(root == null) return;
        System.out.print(root.data + " ");
        dfsPreorder(root.left);
        dfsPreorder(root.right);
    }

    /*
    PreOrder:
         4
       /   \
      2     6
     / \   / \
    1   3 5   7
    */
    static void dfsInorder(Tree root){
        if(root == null) return;
        dfsInorder(root.left);
        System.out.print(root.data + " ");
        dfsInorder(root.right);
    }

    /*
    PostOrder:
         7
       /   \
      3     6
     / \   / \
    1   2 4   5
    */
    static void dfsPostorder(Tree root){
        if(root == null) return;
        dfsPostorder(root.left);
        dfsPostorder(root.right);
        System.out.print(root.data + " ");
    }
}
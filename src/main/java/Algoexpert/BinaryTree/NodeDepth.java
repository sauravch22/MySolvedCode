import java.util.*;

class Program {
    static int counter = 0;
    static void Depth(BinaryTree root,int depth){
        if(root==null){
            return;
        }
        Depth(root.left,depth+1);
        counter += depth;
        Depth(root.right,depth+1);
    }
    public static int nodeDepths(BinaryTree root) {
        counter = 0;
        Depth(root,0);
        return counter;
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}

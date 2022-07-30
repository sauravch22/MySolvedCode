import java.util.*;

class Program {
    public static void invertBinaryTree(BinaryTree tree) {
        // Write your code here.
        if(tree==null){
            return;
        }
        BinaryTree u,v;
        u = tree.left;
        v = tree.right;
        tree.left = v;
        tree.right = u;
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}

import java.util.*;

class Program {
    static int sum = 0;
    static void postorder(BinaryTree root,int level){
        if(root==null){
            return;
        }
        postorder(root.left,level+1);
        postorder(root.right,level+1);
        int temp = level*(level+1);
        sum += temp/2;
    }
    public static int allKindsOfNodeDepths(BinaryTree root) {
        sum = 0;
        postorder(root,0);
        return sum;
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

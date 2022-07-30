import java.util.*;

class Program {
    static int sum = 0;
    static void maxSum(BinaryTree tree){
        if(tree==null){
            return;
        }
        maxSum(tree.left);
        maxSum(tree.right);
        if(tree.left!=null || tree.right!=null){
            BinaryTree a,b;
            int c,d;
            if(tree.left != null){
                a = tree.left;
                c = a.value;
                if(c<0){
                    c = 0;
                }
            }
            else{
                c =0;
            }
            if(tree.right != null){
                b = tree.right;
                d = b.value;
                if(d<0){
                    d=0;
                }
            }
            else{
                d = 0;
            }
            sum = Math.max(tree.value+c+d,sum);
            tree.value = Math.max(tree.value+c,tree.value+d);
            System.out.println(sum+" "+tree.value);
        }
        else{
            sum = Math.max(tree.value,sum);
        }
    }
    public static int maxPathSum(BinaryTree tree) {
        sum = Integer.MIN_VALUE;
        BinaryTree root = tree;
        maxSum(root);
        return sum;
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

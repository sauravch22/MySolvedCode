import java.util.*;

class Program {
    public static int findClosestValueInBst(BST tree, int target) {
        int closestvalue = 0;
        int absDiff = Integer.MAX_VALUE;
        while(tree!=null){
            int currentDiff = Math.abs(tree.value - target);
            if(currentDiff<absDiff){
                absDiff = currentDiff;
                closestvalue = tree.value;
            }
            if(target == tree.value){
                return tree.value;
            }
            else if(target > tree.value){
                tree = tree.right;
            }
            else{
                tree = tree.left;
            }
        }
        return closestvalue;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}

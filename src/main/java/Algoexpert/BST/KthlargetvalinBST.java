import java.util.*;

class Program {
    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        // Write your code here.
        BST curr = tree;
        Stack<BST> stack = new Stack<>();
        while(curr != null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr = curr.right;
            }
            curr = stack.pop();
            k--;
            if(k==0) return curr.value;
            curr = curr.left;
        }
        return -1;
    }
}

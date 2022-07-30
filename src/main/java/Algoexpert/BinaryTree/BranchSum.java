package Algoexpert.BinaryTree;

import java.util.*;

class Program {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        int count =0 ;
        BinaryTree tree = root;
        Stack<Integer> sum = new Stack<Integer>();
        Stack<BinaryTree> BT = new Stack<BinaryTree>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        int addi = 0;
        while(tree!=null || !BT.isEmpty()){
            //System.out.println(tree.value);
            while(tree != null){
                //System.out.println(tree.value);
                addi = addi+tree.value;
                sum.push(addi);
                BT.push(tree);
                tree = tree.left;
            }
            if(!BT.isEmpty()){
                BinaryTree temp = BT.pop();
                tree = temp;

                if(temp.left==null && temp.right==null){
                    count++;
                    //System.out.println(temp.value);
                    if(!BT.isEmpty()){
                        addi = sum.pop();
                        res.add(addi);
                        //System.out.println("->"+addi);
                        tree = BT.pop();
                        addi = sum.pop();
                        //System.out.println("->"+addi);
                        //x = sum.pop();
                        //addi -= tree.value;
                        tree = tree.right;
                        if(tree==null){
                            //System.out.println("Hello");
                            if(!sum.isEmpty()){
                                addi = sum.pop();}
                        }
                    }
                    else{
                        break;
                    }
                }
                else{
                    tree = temp.right;
                    if(tree==null){
                        System.out.println("Hello");
                        if(!sum.isEmpty()){
                            addi = sum.pop();}
                    }
                }}
            else{
                break;
            }
        }
        if(count!=res.size()){
            addi = 0;
            while(root!=null){
                addi = addi +root.value;
                root = root.right;
            }
            res.add(addi);}
        return res;
    }
}

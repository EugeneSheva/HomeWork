package Algoritms.t2tree;



import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    char value;
    Tree left;
    Tree right;

    public Tree(char value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(char value) {
        this.value = value;
    }

    public void recursiveDepth() {
        System.out.print(value+" ");
        if (left != null) {
            left.recursiveDepth();
        }
        if (right != null) {
            right.recursiveDepth();
        }
    }
    public void iterativeDepth(Tree root) {
        Stack<Tree> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Tree tmp = stack.pop();
            System.out.print(tmp.value+" ");
             if (tmp.left != null) {
                 stack.push(tmp.left);
             }
             if (tmp.right != null) {
                 stack.push(tmp.right);
             }
        }
    }
    public void iterativeWidth(Tree root) {
        Queue<Tree> stack = new LinkedList<>();
        stack.offer(root);
        while (!stack.isEmpty()) {
            Tree tmp = stack.remove();
            System.out.print(tmp.value+" ");
            if (tmp.left != null) {
                stack.offer(tmp.left);
            }
            if (tmp.right != null) {
                stack.offer(tmp.right);
            }
        }
    }
    
}

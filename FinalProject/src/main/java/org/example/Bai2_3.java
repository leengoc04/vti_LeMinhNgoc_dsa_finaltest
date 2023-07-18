package org.example;

import java.util.Stack;

public class Bai2_3 {
    public static void main(String[] args) {
        int n =123432;
        Stack<Integer> stack= new Stack<>();
        while (n>0){
            int remind = n %2;
            stack.push(remind);
            n /= 2;
        }
        String binary="";
        while (!stack.isEmpty()){
            binary += stack.pop();
        }
        System.out.println(binary);
    }
}

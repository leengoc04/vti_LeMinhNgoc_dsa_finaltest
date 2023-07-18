package org.example;

public class Bai3_3 {
    public static void main(String[] args) {
        int A[] ={1,23,4,5,6,78,8,2,32,2,32,432,32,234,432,1,432,324};
        for (int i=0; i< A.length; i++ ){
            if (checkSNT(A[i])){
                System.out.println(i);
            }
        }
    }

    static boolean checkSNT2(int x ){
        if (x<2) return false;
        if (x==2) return true;
        for (int i = 2;i<x;i++){
            if (x%i==0) return false;
        }
        return true;
    }

    static boolean checkSNT(int a){
        if(a<2){
            return false;
        }
        int count = 0;
        for(int i = 1;i<=a;i ++){
            if(a%i ==0){
                count ++;
            }
        }
        if(count ==2 ){
            return true;
        }
        return false;
    }
}

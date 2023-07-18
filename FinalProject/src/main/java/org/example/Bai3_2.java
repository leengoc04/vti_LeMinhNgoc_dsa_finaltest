package org.example;

public class Bai3_2 {
    public static void main(String[] args) {
        int A[] ={1,23,4,5,6,78,8,2,32,2,32,432,32,234,432,1,432,324};
       //324,432,
        int left=0;
        int right= A.length-1;
        while (left<right){
            while (A[left]%2==1){
                left++;
            }
            while (A[right]%2==1){
                right--;
            }
            int temp = A[left];
            A[left]=A[right];
            A[right]= temp;

            left++;
            right--;
        }

        for (int x=0;x< A.length;x++){
            System.out.println(A[x]+" ");
        }
    }

}


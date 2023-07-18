package org.example;

import java.util.Arrays;

public class Bai4_1 {
    public static void main(String[] args) {
        int[] A = {100, 2130, 123, 3, 54, 6, 1, 2111, 1, 1, 1, 1, 1, 45, 5, 465, 46, 1234, 54353};
        int size= A.length;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] % 2 == 0 && A[j+1] % 2 == 0 && A[j] > A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        for (int i =0;i<size;i++){
            System.out.println(A[i]+ " ");
        }
    }
}


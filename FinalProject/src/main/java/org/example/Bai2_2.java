package org.example;

public class Bai2_2 {
    public static void main(String[] args) {
        int n =123432;
        int[] digits = new int[String.valueOf(n).length()];

        int i = 0;

        while (n > 0) {
            int digit = n % 10;
            digits[i] = digit;
            i++;
            n /= 10;
        }
        for (int j = digits.length - 1; j >= 0; j--) {
            System.out.println("số: " + digits[j] );
        }
    }
}

package org.example;

public class Bai2_1 {
    public static void main(String[] args) {
        int n = 123432;
        if (check(n)){
            System.out.println("Đối xứng bác ơi");
        }
        else {
            System.out.println("0 đối xứng bác ơi :(");
        }

    }
    public static boolean check(int n){
        String s = Integer.toString(n);
        int l = s.length()-1;
        for (int i =0; i<s.length()/2;i++){
            if (s.charAt(i) != s.charAt(l)){
                return false;
            }
        }
        return true;
    }
}

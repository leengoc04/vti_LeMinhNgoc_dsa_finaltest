package org.example;

public class Bai1 {
    public static void main(String[] args) {
        String s="Abcs12321421@!$@$#@#@%@@$!";
        String result="";

        for (int i = 0; i < s.length(); i++) {
            if (isNormal(s.charAt(i))) {
                char x = s.charAt(i);
                result += x + "";
            }
        }
        System.out.println(result);

    }
    static  boolean isNormal(char c){
////        0-9
//        Aa Bb Cc Ww.
        if (Character.isDigit(c) || Character.isLetter(c)){
            return true;
        }
        return false;
    }
}

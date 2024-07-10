package org.example;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Nayan";
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

}

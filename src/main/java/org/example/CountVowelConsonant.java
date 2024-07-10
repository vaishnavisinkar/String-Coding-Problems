package org.example;

public class CountVowelConsonant {
    public static void main(String[] args) {
        String str = "Java Program to count the total number of vowels and consonants in a string";
        int vCount = 0;
        int cCount = 0;
        int length = str.length();
        System.out.println("Length " +length);
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("Number of vowels " + vCount);
        System.out.println("Number of consonants " + cCount);
    }
}

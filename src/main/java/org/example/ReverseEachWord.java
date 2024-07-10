package org.example;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hello all";
        String revStr = "";
        String words[] = str.split("\\s");
        for(int i=0;i< words.length;i++){
            String word = words[i];
            String revWord = "";
            for(int j= word.length()-1;j>=0;j--){
                revWord = revWord + word.charAt(j);
            }
            revStr = revStr + revWord + " ";
        }
        System.out.println("Reversed String " +revStr);
    }
}

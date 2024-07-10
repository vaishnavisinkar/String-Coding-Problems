package org.example;

public class RemoveSpecialCharacter {

    public static void main(String[] args) {
        String str = "Java Is @Be&s#t Pro!gra#mi%ng La&n(g{ua>ge";
        String result ="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >64 && str.charAt(i) <=122){
                result = result + str.charAt(i) + "";
            }

        }
        System.out.println(result);
    }
}

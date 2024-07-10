package org.example;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java reverse a string";
        String s2 = "";

        //By using the charAt() method
        for(int i=str.length()-1;i>=0;i--){
            s2 =s2 + str.charAt(i);
        }
        System.out.println("Reversed String using charAt() method : " +s2);  //Output : Reversed String using charAt() method : gnirts a esrever avaJ

        //Using build in reverse() method of the StringBuilder class
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        System.out.println("Reversed String using StringBuilder : " +stringBuilder); //Output : Reversed String using StringBuilder : gnirts a esrever avaJ


        //Using StringBuffer

        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println("Reversed String using StringBuffer : " +stringBuffer);  ///Output : Reversed String using StringBuffer : gnirts a esrever avaJ

    }
}

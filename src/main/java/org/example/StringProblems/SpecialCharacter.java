package org.example.StringProblems;

import java.util.ArrayList;
import java.util.List;

public class SpecialCharacter {
    public static void main(String[] args) {
        String str = "Test$ $tr!ng1";

        StringBuilder sb = new StringBuilder();
        str = str.replace(" ", "");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                count++;
            }
            if (Character.isLetterOrDigit(str.charAt(i)) || Character.isSpace(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
       // System.out.println(count);
        //System.out.println(sb);

        String s1="abcd";
        String s2="dcba";
        System.out.println(isSame(s1,s2));
    }

    public static boolean isSame(String str1,String str2){

        StringBuilder sb=new StringBuilder();

            for (int j = str1.length() - 1; j >= 0; j--){
                sb.append(str1.charAt(j));
            }
            if(str2.equals(sb.toString())){
                return true;
            }
            return false;
    }


}

package org.example.StringProblems;

import java.util.*;

public class UniqueOccurence {
    public static void main(String[] args) {
        String str = "aacdcaf";
//        Arrays.sort(str.toCharArray());
        System.out.println(firstOccurence(str));
    }

    public static int firstOccurence(String str) {

        int[] counts = new int[256];

        for(int i=0;i<str.length();i++){
            counts[str.charAt(i)]++;
            System.out.println(counts[str.charAt(i)]);
        }
        System.out.println(Arrays.toString(counts));
        for(int i=0; i<str.length();i++){
            if(counts[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}

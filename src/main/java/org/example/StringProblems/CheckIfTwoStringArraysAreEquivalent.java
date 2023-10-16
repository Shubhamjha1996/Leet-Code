package org.example.StringProblems;

import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
     String[] s1={"ab", "c"};
     String[] s2={"a", "bc"};
        System.out.println(arrayStringsAreEqual(s1,s2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        String str = null;
        for (int i = 0; i < word1.length; i++) {
           // str = s1.append(word1);
        }
        System.out.println(str);
        for (int i = 0; i < word2.length; i++) {
            s2.append(word2);
        }
        System.out.println(s2);
        if (s1.toString() == s2.toString()) {
            return true;
        }
        return false;
    }
}

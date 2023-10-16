package org.example.StringProblems;

import java.util.HashMap;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {
        String str="abacbc";
        System.out.println(areOccurrencesEqual(str));
    }
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        Integer firstValue = map.values().iterator().next();

        for (Integer value : map.values()) {
            if (!value.equals(firstValue)) {
                return false;
            }
        }

        return true;
    }
}

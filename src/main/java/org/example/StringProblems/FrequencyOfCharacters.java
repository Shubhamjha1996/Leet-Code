package org.example.StringProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="abbcdcbaaa";
        Arrays.sort(str.toCharArray());//a,a,a,a,b,b,b,c,c,d
        System.out.println(charFreq(str));
    }
    public static Map<Character,Integer> charFreq(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        char ch;
        for(int i=0;i<str.length();i++){
          ch=str.charAt(i);
          if(map.containsKey(ch)){
              map.put(ch,map.get(ch)+1);
          }
          else {
              map.put(ch,1);
          }
        }
        return map;
    }
}

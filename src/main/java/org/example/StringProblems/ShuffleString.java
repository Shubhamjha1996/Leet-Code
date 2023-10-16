package org.example.StringProblems;

import java.util.HashMap;
import java.util.Map;

public class ShuffleString {

    public static void main(String[] args){

        String str="abc";
        int[] arr={0,1,2};
        System.out.println(restoreString(str,arr));
    }
    public static String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder();
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<indices.length;i++){
                map.put(indices[i], String.valueOf(s.charAt(i)));
        }

        System.out.println(map);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();
            sb.append(value);
        }

        String result = sb.toString();
        return result;
    }
}

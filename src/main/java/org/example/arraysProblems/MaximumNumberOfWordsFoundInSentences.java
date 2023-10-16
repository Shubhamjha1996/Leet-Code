package org.example.arraysProblems;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
    String [] str={"alice and bob in love with leet code", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(str));
    }

    public static int mostWordsFound(String[] sentences) {
        int maxCount=0;
        for(String str:sentences){
            int currlen=str.split(" ").length;
            if(maxCount<currlen){
                maxCount=currlen;
            }
        }
        return maxCount;
    }
}

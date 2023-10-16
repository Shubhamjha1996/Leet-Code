package org.example.StringProblems;

public class TruncateSentence {
    public static void main(String[] args) {
       String str = "Hello how are you Contestant";
       int k=4;
        System.out.println(truncateSentence(str,k));
    }
    public static String truncateSentence(String s, int k) {
        StringBuilder sb=new StringBuilder();
        String arr[]= s.split(" ");
        for(int i=0;i<k;i++){
            if(i<arr.length){
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}

package org.example.arraysProblems;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] str={"--X","X++","X++"};//"++X","X++","X++"
        System.out.println(finalValueAfterOperations(str));

    }
    public static int finalValueAfterOperations(String[] operations) {
        int res=0;
        for(String s:operations){
            if(s.charAt(1)=='+'){
                res=res+1;
            }else{
                res=res-1;
            }
        }
        return res;
    }
}

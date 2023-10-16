package org.example.arraysProblems;

public class MaximumConsecutiveOneOrZeros {
    public static void main(String[] args) {
//        int[] arr={1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int[] arr={1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1};
        System.out.println(OneOrZero(arr,arr.length));
    }

    public static int OneOrZero(int[] arr,int target){
        int count=0;
        int result=0;

        for(int i=0;i<target;i++){
            if(arr==null) return -1;

            if(arr[i]==0){
             count=0;
            }else{
                count++;
                result=Math.max(result,count);
            }
        }
        return result;
    }
}

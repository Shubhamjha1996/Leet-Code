package org.example.arraysProblems;

public class FindCountOfSubArrayThatSums_K {

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int k = 3;// find the count which sum 3
        System.out.println(sumCount(arr, k));
    }

    public static int sumCount(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            //int sum=0;
            for(int j=0;j<arr.length-1;j++) {
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
}

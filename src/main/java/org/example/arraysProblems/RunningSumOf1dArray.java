package org.example.arraysProblems;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
      int[] num={1,2,3,4};
        System.out.println(Arrays.toString( runningSum(num)));
    }

    public static int[] runningSum(int[] nums) {
        int [] arr=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=nums[i] + arr[i-1];
        }
        return arr;
    }
}

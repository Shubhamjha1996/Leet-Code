package org.example.arraysProblems;

import java.util.Arrays;

public class BuildArrayfromPermutation {

    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};

        System.out.println(Arrays.toString(buildArray(nums)));

    }
    public static int[] buildArray(int[] nums) {

        int[] arr=new int[nums.length];
        int index=0;
        for(int i=0;i< nums.length;i++){
            arr[index]=nums[nums[i]];
            index++;
        }
        return arr;
    }
}

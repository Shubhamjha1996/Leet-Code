package org.example.arraysProblems;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] a={8,1,2,2,3};//[4,0,1,1,3]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(a)));

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int re=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    re=re+1;

                }
               arr[i]=re;
            }
        }
        return arr;
    }
}

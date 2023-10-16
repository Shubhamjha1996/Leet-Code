package org.example.arraysProblems;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
          //rotate(arr,k);
        System.out.println(Arrays.toString(rotateArray(arr,k)));
    }

    // brute force
    public static void rotate(int[] nums, int k) {
       int temp=0;
       int end= nums.length-1;
       for(int i=0;i<k;i++){
           for(int j=0;j<end;j++) {
               temp = nums[j];
               nums[j] = nums[end];
               nums[end] = temp;

           }
       }
        System.out.println(Arrays.toString(nums));
    }

    public static long[] rotateArray(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return new long[0];
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

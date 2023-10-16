package org.example.arraysProblems;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {

        int[] num={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(num,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[n + i];
        }
        return arr;
    }
}

package org.example.arraysProblems;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println("Here is the two sum answer");
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target) {
        int start = arr[0];
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] > target) {
                end--;
            } else if (arr[start] + arr[end] < target) {
                start++;
            } else {
                int[] arr1 = {start + 1, end + 1};
                return arr1;
            }
        }
        return new int[0];

    }

/*

    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                int[] arr = {left + 1, right + 1};
                return arr;
            }
        }

        return new int[0];*/

}

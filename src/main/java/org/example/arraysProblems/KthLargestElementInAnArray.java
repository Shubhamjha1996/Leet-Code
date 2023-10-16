package org.example.arraysProblems;

import java.util.Arrays;

public class KthLargestElementInAnArray {

    public static void main(String[] args) {
      int[] arr={3,2,1,5,6,4};
      int k=2;
      Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-k]);
        //System.out.println(findKthLargest(arr,k));
    }
//    public static int findKthLargest(int[] nums, int k) {
//        int max=0;
//        int element=0;
//        for(int i=0;i<nums.length;i++){
//
//            if(max<nums[i]){
//                max=nums[i];
//            }
//            if(element<nums[i] && element<max){
//                element=nums[i];
//              //  System.out.println(element);
//            }
//        }return element;
//    }
}

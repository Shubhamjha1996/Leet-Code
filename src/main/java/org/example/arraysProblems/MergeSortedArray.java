package org.example.arraysProblems;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
         int m=3;
         int[] nums2={2,5,6};
         int n=3;

//         int[] arr=new int[m+n];
//         int index=0;
//         for (int i=0;i<nums1.length;i++){
//             if(nums1[i] !=0){
//                 arr[index]=nums1[i];
//                 index++;
//             }
//         }
        for (int j=0;j<nums2.length;j++){
            if(nums2[j] !=0){
                nums1[m]=nums2[j];
//                arr[index]=nums2[j];
//                index++;
                m++;
            }
        }
        Arrays.sort(nums1);
        System.out.println("This is the array="+ Arrays.toString(nums1));
    }
}

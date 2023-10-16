package org.example.arraysProblems;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(findDuplicate(arr));
        System.out.println(isDuplicate(arr));
    }

    public static boolean isDuplicate(int[] arr){
        if(arr==null) return false;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static int findDuplicate(int[] nums){
        if(nums==null) return -1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }

        return 1000;
    }
}

package org.example.arraysProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr={2,2,1,1,1,2,2};
        System.out.println(majorityElementUsingMap(arr));
        System.out.println(majorityElement(arr));
    }
    //using Sorting--O(n log n)
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    //using Hashmap --O(n)
    public static int majorityElementUsingMap(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        n=n/2;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n){
                return entry.getKey();
            }
        }
        return 0;
    }
}

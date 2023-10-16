package org.example.arraysProblems;

import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
      int target=2;
     // int[] list={-1,1,2,3,1};
        System.out.println(countPairs(Arrays.asList(-1,1,2,3,1), target));
    }
    public static int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    count=count+1;
                }
            }
        }
        return count;
    }
}

package org.example.arraysProblems;

public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        int[] hours={0,1,2,3,4};
        int target=2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours,target));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int empl=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target ){
                empl=empl+1;
            }
        }
        return empl;
    }
}

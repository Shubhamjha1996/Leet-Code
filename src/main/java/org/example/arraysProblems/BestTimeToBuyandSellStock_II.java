package org.example.arraysProblems;

public class BestTimeToBuyandSellStock_II {
    public static void main(String[] args) {
     int[] arr={7,1,5,3,6,4};
        System.out.println(buySellStock(arr));
    }
    public static int buySellStock(int [] arr){
        int profit=0;
        for(int i=1;i< arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit=profit+(arr[i]-arr[i-1]);
            }
        }
        return profit;
    }
}

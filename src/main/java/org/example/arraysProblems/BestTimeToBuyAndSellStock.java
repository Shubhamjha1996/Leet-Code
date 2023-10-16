package org.example.arraysProblems;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] arr={3,6,7,4,8};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices){
        int maxProfit=0;
        int minPrice=prices[0];

        for(int i=0;i<prices.length;i++){
            minPrice=Math.min(minPrice,prices[i]);
            int profit=prices[i]-minPrice;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }

//    public int maxProfitBruteForce(int[] prices) {
//        int price=0;
//        for(int i=0;i<prices.length;i++){
//            for(int j=i+1;j<prices.length;j++){
//                if(prices[i]<prices[j]){
//                    if(price<prices[j]-prices[i]){
//                        price=prices[j]-prices[i];
//                    }
//                }
//            }
//        }
//        return price;
//    }
}

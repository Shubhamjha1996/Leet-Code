package org.example.arraysProblems;

public class RichestCustomerWealth {
    public static void main(String[] args) {
     int[][] arr={{1,2,3},{10,9,1},{4,7,1}};
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {

        int  m=accounts.length;
        int[] a=new int[m];

        for(int i=0;i<m;i++){
            int b=0;
            for(int j=0;j<accounts[i].length;j++){
                b=accounts[i][j]+b;
            }
            a[i]=b;
        }
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}

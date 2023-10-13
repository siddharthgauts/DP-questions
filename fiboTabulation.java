package DP;

public class fiboTabulation {

    public static int fiboTab(int n){
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n]; 
    }
 public static void main(String args[]){
        int n=45;
        System.out.println(fiboTab(n));
    }
}

// 1)  initilization
// 2)  memory
// 3)  filling small to long

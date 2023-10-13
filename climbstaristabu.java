package DP;
//O(n)
public class climbstaristabu {
    
    public static int counttab(int n){
        int  dp[]=  new int[n+1];
        dp[0]=1;
        
        for(int i=1; i<=n; i++) {
            if(i==1){
                dp[i] =1; // dp[1]= 1;  // dp[i]= dp[i-1]
            }
            else{
                 dp[i]= dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }

    public  static void main(String args[]){
        int  n=25;
        System.out.println(counttab(n));
    }
}

class Solution {
    public int climbStairs(int n) {
        int dp[]=new int [n+1];
        return climb(n,dp);
    }
    public static int climb(int n,int []dp){
        if(n==1 || n==0){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int one=climb(n-1,dp);
        int two=climb(n-2,dp);
        dp[n]=one+two;
        return one+two;
    }
}

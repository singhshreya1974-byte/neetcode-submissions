class Solution {
    public int minCostClimbingStairs(int[] c) {
        int dp[]=new int [c.length+1];
        dp[1]=0;
        dp[2]=Math.min(c[0],c[1]);
        for(int i=3;i<c.length+1;i++){
            dp[i]=Math.min(dp[i-1]+c[i-1],dp[i-2]+c[i-2]);       
        }
        return dp[c.length];
    }
}

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int [cost.length+1];
        int zero=climb(cost,dp,0);
        int one=climb(cost,dp,1);
        return Math.min(one,zero);
    }
    public static int climb(int []cost,int []dp,int i){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=0){
            return dp[i];
        }
        int one=cost[i]+climb(cost,dp,i+1);
        int two=cost[i]+climb(cost,dp,i+2);
        dp[i]=Math.min(one,two);
        return Math.min(one,two);
    }
}

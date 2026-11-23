class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);

        int first=rob(nums,0,nums.length-2);
        int last=rob(nums,1,nums.length-1);
        return Math.max(first,last);
        
    }
    public static int rob(int []nums,int st,int la){
        int dp[]=new int[la-st+1];
        dp[0]=nums[st];
        dp[1]=Math.max(nums[st],nums[st+1]);

        for(int i=2;i<la-st+1;i++){
            dp[i]=Math.max(dp[i-1],nums[st+i]+dp[i-2]);
        }
        return dp[dp.length-1];
    }
}

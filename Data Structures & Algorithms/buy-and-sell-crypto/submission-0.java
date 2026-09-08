class Solution {
    public int maxProfit(int[] p) {
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<p.length;i++){
            min=Math.min(min,p[i]);

            int profit=p[i]-min;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}

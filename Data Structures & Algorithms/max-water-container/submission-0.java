class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int max=0;
        while(i<j){
            int len=Math.min(nums[i],nums[j]);
            int bre=j-i;
            int area=len*bre;
            max=Math.max(area,max);
            if(nums[i]<nums[j]) i++;
            else if(nums[j]<nums[i])j--;
            else {
                i++;
                j--;
            }
        }
        return max;
    }
}

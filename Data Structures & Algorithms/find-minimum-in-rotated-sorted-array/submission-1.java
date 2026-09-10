class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(l<r){

            int mid=l+(r-l)/2;
            if(nums[r]<nums[mid]){
                l=mid+1;
            }
            else if(nums[mid]<nums[r]){
                r=mid;
            }
            min=Math.min(nums[mid],min);
        }
        return nums[l
        ];
    }
}

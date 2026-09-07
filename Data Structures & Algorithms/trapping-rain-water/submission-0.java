class Solution {
    public int trap(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int lm=arr[0];
        int rm=arr[r];
        int water=0;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(arr[l]>lm) lm=arr[l];
                water+=lm-arr[l];
                l++;
            }
            else if(arr[l]>arr[r]){
                if(arr[r]>rm) rm=arr[r];
                water+=rm-arr[r];
                r--;
            }
        }
        return water;
    }
}

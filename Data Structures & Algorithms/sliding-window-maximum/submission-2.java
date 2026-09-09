class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int arr[]=new int[nums.length-k+1];
        int idx=0;
        for(int i=0;i<nums.length;i++){

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.removeLast();
            }

            while(!dq.isEmpty() && dq.peek()<=i-k){
                dq.removeFirst();
            }

            dq.offerLast(i);

            if(i>=k-1){
                arr[idx++]=nums[dq.peek()];
            }
        }
        return arr;
    }
}

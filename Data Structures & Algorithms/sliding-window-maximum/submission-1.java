class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[]=new int[nums.length-k+1];
        int idx=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> nums[b] - nums[a]);
        
        for(int i=0;i<nums.length;i++){

            while(!pq.isEmpty() && pq.peek()<=i-k ){
                pq.poll();
            }

            pq.offer(i);

            if(i>=k-1){
                arr[idx++]=nums[pq.peek()];
            }

        }
        return arr;
    }
}

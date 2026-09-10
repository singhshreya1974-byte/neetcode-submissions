class Solution {
    public int lastStoneWeight(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        while(!pq.isEmpty() &&pq.size()>1){
            int n=pq.poll();
            int m=pq.poll();
            if(n==m) continue;
            if(m<n) pq.offer(n-m);
        }
        if(pq.isEmpty()) return 0;
        return pq.poll();
        
    }
}

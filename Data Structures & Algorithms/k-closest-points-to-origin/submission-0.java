class Solution {
    public int[][] kClosest(int[][] p, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>( (a, b) -> {
                int d1 = a[0] * a[0] + a[1] * a[1];
                int d2 = b[0] * b[0] + b[1] * b[1];
                return d1 - d2;
            });
        int arr[][]=new int[k][2];
        
        //int z=p[0][0]*p[0][0]+p[0][1]*p[0][1];
        for(int i=0;i<p.length;i++){
            int x2=p[i][0];
            int y2=p[i][1];
            int o=(x2*x2)+(y2*y2);
            pq.add(p[i]);
                
        }
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        return arr;

    }
}

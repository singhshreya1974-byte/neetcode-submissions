class Solution {
    public int carFleet(int target, int[] p, int[] speed) {
        int n=speed.length;
        double time[][]=new double[n][2];
        for(int i=0;i<n;i++){
            time[i][0]=p[i];
            double k=(double)(target-p[i])/speed[i];
            time[i][1]=k;
        }
        Arrays.sort(time, (a, b) -> Double.compare(a[0], b[0]));
        int fleet=0;
        double maxtime=0;
        for(int i=n-1;i>-1;i--){
            if(time[i][1]>maxtime)
            {fleet++;
            maxtime=time[i][1];}
        }
        return fleet;

    }
}

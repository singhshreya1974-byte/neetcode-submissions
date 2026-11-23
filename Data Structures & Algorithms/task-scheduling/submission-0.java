class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []arr=new int [26];
        for(int i=0;i<tasks.length;i++){
            arr[tasks[i]-'A']++;
        }
        int max=-1;
        for(int i=0;i<26;i++){
            max=Math.max(arr[i],max);
        }
        int totalmax=0;
        for(int i=0;i<26;i++){
            if(max==arr[i]){
                totalmax++;
            }
        }
        int result=(n+1)*(max-1)+totalmax;
        return Math.max(tasks.length,result);
    }
}

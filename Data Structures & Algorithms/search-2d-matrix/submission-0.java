class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int l=m[0].length-1;
        int r=0;
        while(l>=0 && r<m.length){
            
            if(m[r][l]==target){
                return true;
            }
            else if( m[r][l]<target){
                r++;
            }
            else{
                l--;
            }
        }
        return false;
        
    }
}

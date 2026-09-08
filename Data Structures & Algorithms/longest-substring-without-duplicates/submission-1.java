class Solution {
    public int lengthOfLongestSubstring(String s) {
        int last[]=new int[128];
        int lft=0;
        int len=0;
        for(int ryt=0;ryt<s.length();ryt++){
            char ch=s.charAt(ryt);
            if(last[ch]!=0 && last[ch]>lft){
                lft=last[ch];
            }
            last[ch]=ryt+1;
            len=Math.max(ryt-lft+1,len);
        }
        return len;
    }
}

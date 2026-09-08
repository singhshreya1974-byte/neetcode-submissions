class Solution {
    public int characterReplacement(String s, int k) {
        int []fre=new int[26];
        int lft=0;
        int len=0;
        int max=0;
        for(int ryt=0;ryt<s.length();ryt++){
            fre[s.charAt(ryt)-'A']++;

            max=Math.max(max,fre[s.charAt(ryt)-'A']);

        
            while((ryt-lft+1)-max>k){
                fre[s.charAt(lft)-'A']--;
                lft++;
            }

            len=Math.max(len,ryt-lft+1);
        }
        return len;
    }
}

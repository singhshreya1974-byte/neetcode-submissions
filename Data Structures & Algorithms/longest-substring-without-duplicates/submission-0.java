class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int lft=0;
        int len=0;
        for(int ryt=0;ryt<s.length();ryt++){
            while(set.contains(s.charAt(ryt))){
                set.remove(s.charAt(lft));
                lft++;
            }
            set.add(s.charAt(ryt));
            len=Math.max(ryt-lft+1,len);
        }
        return len;
    }
}

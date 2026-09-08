class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(m<n) return false;
        int fre[]=new int[26];
        int fre2[]=new int[26];
        for(int i=0;i<n;i++){
            fre[s1.charAt(i)-'a']++;
            fre2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(fre,fre2)) return true;
        int lft=0;
        for(int i=n;i<m;i++){
            fre2[s2.charAt(lft)-'a']--;
            lft++;
            fre2[s2.charAt(i)-'a']++;
            if(Arrays.equals(fre,fre2)) return true;
        }
        return false;
    }
}

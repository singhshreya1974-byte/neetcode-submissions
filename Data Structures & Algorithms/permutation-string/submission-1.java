class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int n=s1.length();
        char[]arr=s1.toCharArray();
        Arrays.sort(arr);
        s1=Arrays.toString(arr);
        String s=s2.substring(0,n);
        arr=s.toCharArray();
        Arrays.sort(arr);
        s=Arrays.toString(arr);
        if(s.equals(s1)) return true;
        int lft=1;
        for(int ryt=n;ryt<s2.length();ryt++){
            s=s2.substring(lft,ryt+1);
            lft++;
            arr=s.toCharArray();
            Arrays.sort(arr);
            s=Arrays.toString(arr);
            if(s1.equals(s)) return true;
        }
        return false;
    }
}

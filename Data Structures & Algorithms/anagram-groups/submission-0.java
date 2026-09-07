class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int []arr=new int [26];
            String s=strs[i];
            for(int j=0;j<s.length();j++){
                arr[s.charAt(j)-'a']++;
            }
            String key=Arrays.toString(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

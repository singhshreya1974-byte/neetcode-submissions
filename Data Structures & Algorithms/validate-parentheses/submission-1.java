class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char chh='(';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()) chh=st.peek();
            if(!st.isEmpty() &&( ch==')'&& chh=='(' || ch=='}'&& chh=='{' ||ch==']'&& chh=='[')){
                st.pop();
            }
            else {
                st.push(ch);

            }
        }
        return st.isEmpty();
    }
}

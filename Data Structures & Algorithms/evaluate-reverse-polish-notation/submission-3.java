class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
                if(s.equals("+")){
                    int m=st.pop();
                    int n=st.pop();
                    st.push(m+n);
                }
                else if(s.equals("-")){
                    int m=st.pop();
                    int n=st.pop();
                    st.push(n-m);
                }
                else if(s.equals("*")){
                    int m=st.pop();
                    int n=st.pop();
                    st.push(m*n);
                }
                else if(s.equals("/")){
                    int m=st.pop();
                    int n=st.pop();
                    st.push(n/m);
                }
            
            else{
                int t=Integer.parseInt(s);
                st.push(t);
            }
        }
        return st.pop();
    }
}

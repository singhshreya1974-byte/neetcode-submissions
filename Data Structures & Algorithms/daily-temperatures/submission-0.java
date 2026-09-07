class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st=new Stack<>();
        int [] arr=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            int k=temp[i];
            while(!st.isEmpty() && k>temp[st.peek()]){
                arr[st.peek()]=i-st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            arr[st.pop()]=0;
        }
        return arr;
    }
}

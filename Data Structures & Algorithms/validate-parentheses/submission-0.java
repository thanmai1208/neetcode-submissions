class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char is=s.charAt(i);
        if(is=='{'|| is=='('||is=='['){
            st.push(is);
        }else{
            if(st.isEmpty()){
                return false;
            }
            char t=st.pop();
            if(is==')' &&t!='(' || is=='}' && t!='{' || is==']' && t!='['){
                return false;

            }
        }
        
        }
        return st.isEmpty();
        
    }
}

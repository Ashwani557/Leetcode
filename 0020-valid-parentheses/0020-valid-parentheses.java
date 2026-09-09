class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        char [] arr = s.toCharArray();
        for(char ch : arr){
            if(ch =='('||ch =='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if(st.isEmpty()){
                    return false;
                }
                char c = st.peek();
                if((ch==')'&&c=='(')||(ch=='}'&&c=='{')||(ch==']'&&c=='[')){
                    st.pop();
                }
                else {
                    return false; // mismatched bracket
                }
            }
        }
        return st.isEmpty();

    }
}
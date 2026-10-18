class Solution {
    public String finalString(String s) {
        String res = "";
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                res = new StringBuilder(res).reverse().toString();
                }else{
                
                res+=s.charAt(i);
                }
            
        
        }
        return res;
        
    }
}
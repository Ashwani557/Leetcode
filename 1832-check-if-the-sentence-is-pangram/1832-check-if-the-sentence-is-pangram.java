class Solution {
    public boolean checkIfPangram(String sentence) {
        int count =0;
        for(char ch = 'a';ch<='z';ch++){
            if(sentence.contains(String.valueOf(ch))){
                count++;
            }
            if(count==26){
                return true;
            }
        }
        return false;
    }
}
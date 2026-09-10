class Solution {
    public boolean digitCount(String num) {
        int count[]=new int[10];
        for(char c:num.toCharArray()){
            count[c-'0']++;
        }
        for(int i=0;i<num.length();i++){
            if(count[i]!=num.charAt(i)-'0'){
                return false;
            }
        }
        return true;
    }
}
// class Solution {
//     public boolean digitCount(String num) {
//         char[] arr = num.toCharArray();
//         for(int i = 0; i < num.length(); i++) {
//             int count = 0;
//             for(int j = 0; j < num.length(); j++) {
//                 if(arr[j] - '0' == i) {
//                     count++;
//                 }
//             }
//             if(count != arr[i] - '0') {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
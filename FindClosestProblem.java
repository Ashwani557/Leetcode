class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(z-x)==Math.abs(y-z)) return 0;
        else return (Math.abs(x-z)<Math.abs(y-z))?1:2;
    }
}


// class Solution {
//     public int findClosest(int x, int y, int z) {

//         int d1 = Math.abs(x - z);
//         int d2 = Math.abs(y - z);

//         if(d1 == d2){
//             return 0;
//         }
//         else if(d1 < d2){
//             return 1;
//         }
//         else{
//             return 2;
//         }
//     }
// }
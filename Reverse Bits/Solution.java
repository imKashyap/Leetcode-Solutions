public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int a) {
         int b = 0;
        for(int i = 31; i >=0; i--){
            if((a & 1<<i) != 0){
                b = b | 1<<(31-i);
            }
        }
        return b;
    }
}
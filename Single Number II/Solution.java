class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        int not_threes;
        int x;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i];
            twos |= ones & x; 
            ones ^= x;  
            not_threes = ~(ones & twos); 
            ones &= not_threes;   
            twos &= not_threes; 
        }
        return ones;
    }
}
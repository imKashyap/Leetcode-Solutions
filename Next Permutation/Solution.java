class Solution {
    public void nextPermutation(int[] nums) {
        int r1=-1, r2=-1;          
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                r1=i-1;
                break;
            }
        }
        if(r1==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[r1]){
                r2=i;
                break;
            }
        }
        int t=nums[r1];
        nums[r1]=nums[r2];
        nums[r2]=t;
        for(int i=r1+1, j= nums.length-1;i<j;i++,j--){
            t=nums[j];
            nums[j]=nums[i];
            nums[i]=t;
        }
    }
}
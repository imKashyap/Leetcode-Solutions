class Solution {
    public void sortColors(int[] nums) {
        int low=0, temp, mid=0, high=nums.length-1;
        while(mid<=high){
            switch(nums[mid]){
                case 0:temp=nums[low];
                        nums[low]=nums[mid];
                        nums[mid]=temp;
                        mid++;low++;
                        break;
                case 1:mid++;break;
                case 2:temp=nums[high];
                        nums[high]=nums[mid];
                        nums[mid]=temp;
                        high--;
            }
        }
    }
}
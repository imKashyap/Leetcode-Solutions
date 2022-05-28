class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    
    private static void reverse(int a[] , int s, int e){
        while(s<e){
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
    }
}
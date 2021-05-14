class Solution {
    public List<List<Integer>> threeSum(int[] A) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(A);
		for(int i = 0; i < A.length - 2 && A[i] <= 0; i++){
			if(i == 0 || A[i] != A[i - 1])
				twoSum(list, A, i + 1, A[i]);	
		}
		return list;
    }
    
    private void twoSum(List<List<Integer>> list, int[] A, int start, int x){
        int end=A.length-1;
		while(start < end){
			int target = -x;											
			int y = A[start];
			int z = A[end];
			
			if(y + z == target){   
				list.add(Arrays.asList(x, y, z));						 
				while(start < end && A[start] == A[start + 1]) start++;
				while(start < end && A[end] == A[end - 1])     end--;
				start++; end--;
			}
			else if(y + z < target)
				start++;
			else
				end--;
	   }
	}
    
}
class Solution {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> list= new LinkedList<>();
        for(int i=0;i<intervals.length;i++)
            list.add(intervals[i]);
        Collections.sort(list,(a, b)->{
            if(a[0]==b[0])return a[1]-b[1];
            return a[0]-b[0];
        });
        int i=0, j=1;
        while(j<list.size()){
            int[] current=list.get(i);
            int[] toCompare=list.get(j);
            if(toCompare[0]>current[1]){
                i++;j++;continue;
            }
            else{
                current[0]=Math.min(current[0],toCompare[0]);
                current[1]=Math.max(current[1],toCompare[1]);
                list.remove(j);
            } 
        }
        int[][] ans= new int[list.size()][2];
        for( i=0;i<ans.length;i++)
            ans[i]=list.get(i);
        return ans;
        
    }
}
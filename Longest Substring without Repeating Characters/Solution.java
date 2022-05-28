class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int max=0;
        Deque<Character> dq= new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            boolean isFirst= set.add(ch);
            if(isFirst)dq.offerLast(ch);
            else{
                int l=dq.size();
                if(l>max)max=l;
                while(!dq.isEmpty() && dq.peekFirst()!=ch){
                    set.remove(dq.peekFirst());
                    dq.pollFirst();
                }
                dq.pollFirst();
                dq.offerLast(ch);
            }
        }
        int l=dq.size();
        if(l>max)max=l;
        return max;
    }
}
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();
        for(String str: strs){
            char[] chArr=str.toCharArray();
            Arrays.sort(chArr);
            String sorted=new String(chArr);
            if(!map.containsKey(sorted)) 
                map.put(sorted, new LinkedList<>());
            map.get(sorted).add(str);
           
        }
       return new LinkedList<>(map.values());
    }
}
import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String sen="";
        StringBuffer wrd= new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch!=' ')
                wrd.append(ch);
            else{
                if(wrd.length()!=0){
                    sen=wrd+" "+sen;
                    wrd.delete(0, wrd.length());
                }
            }
        }
        if(wrd.length()!=0)
            sen=wrd+" "+sen;
        return sen.trim();
    }
}

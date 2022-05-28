import java.util.*;
class Solution {
    public String replaceDigits(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(i%2!=0){
                char ch=s.charAt(i-1);
                ch=(char)(ch+Integer.parseInt(String.valueOf(s.charAt(i))));
                sb.append(ch);
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
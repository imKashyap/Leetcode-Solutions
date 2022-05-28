import java.lang.Math;

class Solution {
    public int sumBase(int n, int k) {
        int converted=0, i=0;
        while(n!=0){
            int tmp=n%k;
            converted+=tmp*(int)Math.pow(10,i++);
            n/=k;
        }
        int sum=0;
        for(;converted!=0;sum+=converted%10,converted/=10);
        return sum;
    }
}
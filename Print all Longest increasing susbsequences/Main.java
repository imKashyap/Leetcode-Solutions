
/*
	I/P= 10, 22, 9, 33, 21, 50, 41, 60, 80 ,1
	O/P= 10->22->33->41->60->80
	     10->22->33->50->60->80
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		int[] arr= new int[]{1,2,4,3,5,4,7,2};
		solution(arr);
	}


	 public static void solution(int []arr){
// write your code here
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        
        int max=1;
        for(int i=1;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(arr[prev]<arr[i]){
                    dp[i]=Math.max(dp[i],dp[prev]+1);
                    max=Math.max(max,dp[i]);
                }
            }
        }
        
        int idx=n-1;
        for(int i=n-1;i>=0;i--){
            if(dp[i]==max){
                idx=i;
                break;
            }
        }
        
        List<List<Integer>> lis= new ArrayList<>();
        solve(max, idx, dp,arr,new ArrayList<>(), lis);
        
        for(List<Integer> seq:lis){
            String ans="";
            for(int val:seq){
                ans+=val+"->";
            }
            ans=ans.substring(0,ans.length()-2);
            System.out.println(ans);
        }
        
    }
    
    private static void solve(int target, int idx, int[] dp, int[] arr, 
                        List<Integer> seq, List<List<Integer>> lis){
        
        if(target==0){
            lis.add(new ArrayList<>(seq));
            return;
        }
        
        for(int i=idx;i>=0;i--){
            if(dp[i]==target){
		if(seq.isEmpty() || arr[i]<seq.get(0)){
			seq.add(0,arr[i]);
			solve(target-1, i-1,dp,arr,seq,lis);
			seq.remove(0);
		}
            }
        }
    }
}

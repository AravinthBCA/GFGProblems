// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class MakeDistinctDigitArray {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		nums[i] = sc.nextInt();
		Solution1 ob = new Solution1();
		int[] ans = ob.common_digits(nums);
		for (int i = 0; i < ans.length; i++)
		System.out.print(ans[i] + " ");
		System.out.println();

	}
}

class Solution1 {
	public int[] common_digits(int[] arr) {
		int n =arr.length;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i = 0; i<n; i++){
            int number = arr[i];
            while(number>0){
                int rem = number%10;
                hs.put(rem,1);
                number =  number/10;
            }
            
        }
        int s = 0;
        int arr1[] = new int[hs.size()];
        int i=0;
        for(Map.Entry mp : hs.entrySet()){
        	arr1[i]=(int) mp.getKey();
        	i++;
        }
       return arr1;
	}
}
// { Driver Code Starts
import java.io.*;
import java.util.Scanner;

class ContigousSubArrayMaximumSum {
    
	public static void main (String[] args) throws IOException {
		Scanner in = new Scanner(System.in);    
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
		   arr[i] = in.nextInt();
		}
		Solution6 obj = new Solution6();
        System.out.println(obj.maxSubarraySum(arr, n));
	}
}

class Solution6{

    long maxSubarraySum(int arr[], int n){
    	long sum=0;
        long max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            System.out.println("Sum : "+sum);
            max=Math.max(max,sum);
            System.out.println("Max : "+max);
            if(sum<0)
            sum=0;
        }
        return max;
    }
    
}

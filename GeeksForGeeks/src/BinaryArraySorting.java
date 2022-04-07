// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class BinaryArraySorting{
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int array[] = new int [n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            int result[] = new int[n];
            result =  ob.SortBinaryArray(array,n);
            for(int i=0; i<n; i++)
            	System.out.print(result[i]+" "); 
            System.out.println();
            t--;
        }
    } 
}



class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
//		first solution
//	    Arrays.sort(arr);
//		return arr;
		
//		second solution
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	} 
	
} 

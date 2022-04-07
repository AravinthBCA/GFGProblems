// { Driver Code Starts
import java.io.*;
import java.util.*;

class MergeWithoutExtraSpace {
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter first array size : ");
    	long arr1[] = new long[in.nextInt()];
    	System.out.println("Enter second array size : ");
        long arr2[] = new long[in.nextInt()];
        for (int i = 0; i < arr1.length; i++) {
             arr1[i] = in.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
       }
       new Solution2().merge(arr1, arr2, arr1.length, arr2.length);
       StringBuffer str = new StringBuffer();
       for (int i = 0; i < arr1.length; i++) {
           str.append(arr1[i] + " ");
       }
       for (int i = 0; i < arr2.length; i++) {
           str.append(arr2[i] + " ");
       }
       System.out.println(str);
     }
}
class Solution2 {

    public void merge(long arr1[], long arr2[], int n, int m) {
    	int i = 0, j = 0, k = n - 1;
        while (i <= k && j < m) {
        	System.out.println("k : "+k);
            if (arr1[i] < arr2[j])
                i++;
            else {
                long temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
//              System.out.println("Array 1 : "+Arrays.toString(arr1));
//              System.out.println("Array 2: "+Arrays.toString(arr2));
//              System.out.println("--------------------------------------------");
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Array 1 : "+Arrays.toString(arr1));
        System.out.println("Array 2 : "+Arrays.toString(arr2));
    }
}
// { Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

public class ValidateanIPAddress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Solution3 obj = new Solution3();
		if (obj.isValid(s))
			System.out.println(1);
		else
			System.out.println(0);
	}
}

class Solution3 {

	public boolean isValid(String s) {
		if(s.charAt(0)=='.'||s.charAt(s.length()-1)=='.') {
			return false;
		}
		else {
			int count=0,temp = 0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)>48 && s.charAt(i)<57) {
					count++;
					System.out.println("temp : "+temp);
				}
				else if(s.charAt(i)=='.' && count==3 && temp<=255){
					count=0;
				}
				else {
					System.out.println("sss");
					return false;
				}
			}
		}
		return true;
	}
}
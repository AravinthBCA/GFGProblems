import java.util.*;
import java.io.*;

public class LookAndSay {
	public static void Solution(int n) {
		String str = "1";
		if(n == 1) {
			System.out.println("1");
			return; 
		}
		System.out.print("1");
		for(int i=1; i<n; i++) {
			System.out.println();
			int k = 0;
			String temp = "";
			while(k < str.length()) {
				int currentCharCount = 1;
				while(k < str.length()-1 && (str.charAt(k) == str.charAt(k+1))) {
					currentCharCount ++;
					k++;
				}
				temp += Integer.toString(currentCharCount) + str.charAt(k);
				k++;
 			}
			str = temp;
			System.out.print(str);
		}
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number : ");
//		int n = in.nextInt();
		Solution(5);
	}

}

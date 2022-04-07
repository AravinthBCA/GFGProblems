// { Driver Code Starts
import java.util.*;

class WildcardPatternMatching
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			String pat = sc.nextLine();
			String text = sc.nextLine();
			Solu g = new Solu();
			System.out.println(g.wildCard(pat,text));
	}
}

class Solu
{
    int wildCard(String pattern, String str)
    {
    	boolean flag = false;
    	for (int i = 0; i < pattern.length(); ++i) {
			if(pattern.charAt(i)==str.charAt(i)) {
				continue;
			}
			else if(pattern.charAt(i)=='*') {
				++i;
				for (int j = i; j < str.length(); j++) {
					if(pattern.charAt(i)==str.charAt(j)) {
						flag = true;
						break;
					}
				}
				if(flag==false) {
					return 0;
				}
				
			}
			else if(pattern.charAt(i)=='?') {
			}
			else {
				continue;
			}
		}
    	return 1;
    }
}

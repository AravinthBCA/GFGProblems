import java.io.*;
import java.util.*;

public class RemoveDuplicateSortedArray {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int a[] = new int[N];
			for (int i = 0; i < N; i++)
				a[i] = sc.nextInt();

			Solution7 g = new Solution7();
			int n = g.remove_duplicate(a, N);

			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			System.out.println();
	}
}

class Solution7 {
	int remove_duplicate(int A[], int N) {
		int res = 1;
		for (int i = 1; i < N; i++) {
			if (A[i] != A[res - 1]) {
				A[res] = A[i];
				res++;
			}
		}
		return res;
	}
}
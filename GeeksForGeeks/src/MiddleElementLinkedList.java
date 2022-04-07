
// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node1 {
	int data;
	Node1 next;

	Node1(int x) {
		data = x;
		next = null;
	}

}

class MiddleElementLinkedList{
	static void printList(Node1 node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Node1 head = new Node1(sc.nextInt());
		Node1 tail = head;
		for (int i = 0; i < n - 1; i++) {
			tail.next = new Node1(sc.nextInt());
			tail = tail.next;
		}
		Solution5 g = new Solution5();
		int ans = g.getMiddle(head);
		System.out.println(ans);
//		printList(head);
	}
}

class Solution5 {
	int getMiddle(Node1 head) {
//		First solution
//		int size = 0, size1 = 0;
//		if (head == null) {
//			return 0;
//		}
//		Node1 current = head;
//		while (current != null) {
//			size++;
//			current = current.next;
//		}
//		current = head;
//		while (current != null) {
//			if (size1 == (size / 2)) {
//				return current.data;
//			}
//			size1++;
//			current = current.next;
//		}
//		return 1;
		
//		Second Solution
		Node1 fast=head;
        Node1 slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=(fast.next).next;
        }
      return slow.data;    
	}
}

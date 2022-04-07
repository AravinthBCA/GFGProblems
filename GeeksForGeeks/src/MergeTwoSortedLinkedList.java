
// { Driver Code Starts
import java.util.*;

class Node2 {
	int data;
	Node2 next;

	Node2(int d) {
		data = d;
		next = null;
	}
}

class MergeTwoSortedLinkedList {
	Node2 head;

	public static void printList(Node2 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Node2 head1 = new Node2(sc.nextInt());
		Node2 tail1 = head1;
		for (int i = 0; i < n1 - 1; i++) {
			tail1.next = new Node2(sc.nextInt());
			tail1 = tail1.next;
		}
		Node2 head2 = new Node2(sc.nextInt());
		Node2 tail2 = head2;
		for (int i = 0; i < n2 - 1; i++) {
			tail2.next = new Node2(sc.nextInt());
			tail2 = tail2.next;
		}

		LinkedList obj = new LinkedList();
		Node2 head = obj.sortedMerge(head1, head2);
		printList(head1);
		printList(head2);
		printList(head);
	}
}

class LinkedList {
	Node2 sortedMerge(Node2 head1, Node2 head2) {
//		First Solution
//		Node2 node = new Node2(0);
//		Node2 current = node;
//		while (head1 != null && head2 != null) {
//			if (head1.data < head2.data) {
//				Node2 temp = new Node2(head1.data);
//				current.next = temp;
//				current = current.next;
//				head1 = head1.next;
//			} else {
//				Node2 temp = new Node2(head2.data);
//				current.next = temp;
//				current = current.next;
//				head2 = head2.next;
//			}
//		}
//		while(head1!=null) {
//			Node2 temp = new Node2(head1.data);
//			current.next = temp;
//			current = current.next;
//			head1 = head1.next;
//		}
//		while(head2!=null) {
//			Node2 temp = new Node2(head2.data);
//			current.next = temp;
//			current = current.next;
//			head2 = head2.next;
//		}
//		return node.next;
//		Second Solution
		if(head1 == null)
		     return head2;
		     if(head2 == null)
		     return head1;
		     Node2 temp = null;
		     if(head1.data<head2.data){
		        head1.next  = sortedMerge(head1.next,head2);
		        temp = (Node2) head1;
		        }
		    else{
		        head2.next = sortedMerge(head1,head2.next);
		        temp = (Node2) head2;}
		    return (Node2) temp;
	}
}

package tech.prep.problems;

import tech.prep.ds.LinkedLists.LinkedList;
import tech.prep.ds.LinkedLists.Node;

public class MergeTwoLinkedList {
	static Node<Integer> mergeTwoLinkedLists(Node<Integer> l1, Node<Integer> l2) {
		Node<Integer> res = null;
		Node<Integer> first = null;
		while (l1 != null || l2 != null) {
			Node<Integer> temp;
			if (l1 == null) {
				temp = new Node<Integer>(l2.value);
			} else if (l2 == null) {
				temp = new Node<Integer>(l1.value);
			} else {
				int val = (l1.value < l2.value) ? l1.value : l2.value;
				temp = new Node<Integer>(val);
			}
			if (res == null) {
				res = temp;
				first = temp;
			} else {
				res.next = temp;
				res = res.next;

			}
		}
		return first;

	}
	
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		LinkedList ll2 = new LinkedList();
		ll.addAtEnd(1);
		ll.addAtEnd(2);
		ll.addAtEnd(3);
		ll2.addAtEnd(4);
		ll2.addAtEnd(5);
		ll2.addAtEnd(6);
		ll.printLinkedList(mergeTwoLinkedLists(ll.getFirstNode(),ll2.getFirstNode()));

	}
}

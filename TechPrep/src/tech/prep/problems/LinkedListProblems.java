package tech.prep.problems;

import tech.prep.ds.LinkedLists.LinkedList;
import tech.prep.ds.LinkedLists.Node;

public class LinkedListProblems {
	static Node<Integer> removeKFromList(Node<Integer> l, int k) {
		if (l == null) {
			return l;
		}else{
			while(l.value==k){
				l=l.next;
			}
		Node<Integer> first = l;
		Node<Integer> temp  = l;
		while (l != null) {
			if (l.value == k) {
				temp.next = l.next;
			} else {
				temp=l;
				
			}
			l = l.next;

		}
		return first;
		}
	}

	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.addAtEnd(1000);
		ll.addAtEnd(1000);
		ll.addAtEnd(1000);
		ll.addAtEnd(2000);
		ll.addAtEnd(1000);
		ll.addAtEnd(2);
		ll.printLinkedList(removeKFromList(ll.getFirstNode(), 1000));

	}
}

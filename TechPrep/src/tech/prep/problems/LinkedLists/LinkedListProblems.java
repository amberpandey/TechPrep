package tech.prep.problems.LinkedLists;

import tech.prep.ds.LinkedLists.LinkedList;
import tech.prep.ds.LinkedLists.Node;

/**
 * Given a singly linked list of integers l and an integer k, remove all
 * elements from list l that have a value equal to k.
 * 
 * Example
 * 
 * For l = [3, 1, 2, 3, 4, 5] and k = 3, the output should be removeKFromList(l,
 * k) = [1, 2, 4, 5]; For l = [1, 2, 3, 4, 5, 6, 7] and k = 10, the output
 * should be removeKFromList(l, k) = [1, 2, 3, 4, 5, 6, 7].
 * 
 * @author amberpandey
 *
 */
public class LinkedListProblems {
	static Node<Integer> removeKFromList(Node<Integer> l, int k) {
		if (l == null) {
			return l;
		} else {
			while (l.value == k) {
				l = l.next;
			}
			Node<Integer> first = l;
			Node<Integer> temp = l;
			while (l != null) {
				if (l.value == k) {
					temp.next = l.next;
				} else {
					temp = l;

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

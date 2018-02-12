package tech.prep.problems.LinkedLists;

import tech.prep.ds.LinkedLists.LinkedList;
import tech.prep.ds.LinkedLists.Node;


/**
 * 
 * Given a singly linked list of integers l and a non-negative integer n, move
 * the last n list nodes to the beginning of the linked list. Example:- For l =
 * [1, 2, 3, 4, 5] and n = 3, the output should be rearrangeLastN(l, n) = [3, 4,
 * 5, 1, 2]; For l = [1, 2, 3, 4, 5, 6, 7] and n = 1, the output should be
 * rearrangeLastN(l, n) = [7, 1, 2, 3, 4, 5, 6].
 * 
 * SOLUTION APPROACH:- 
 * We will solve this by Sliding window algo:- 
 * 1. we willkeep a window of n length; 
 * 2. we will slide this window to the end of linked
 * list. 
 * 3. we will keep track of 3 variables tail of sliding window, head of sliding window and previous to tail(sliding window) 
 * 4. At the end we will assign head to first node of linked list.and next of previous to tail to
 * null.
 * 
 * @author amberpandey
 *
 */
public class ReArrangeLastN {
	@SuppressWarnings("unchecked")
	static Node<Integer> rearrangeLastN(Node<Integer> l, int n) {
		if (l != null && l.next != null && n >= 1) {
			Node<Integer> frstNode = l;
			Node<Integer> tempTail = l;
			Node<Integer> tempHead = l;
			Node<Integer> prevTotempTail = l;
			int count = 1;
			while (l != null) {

				if (tempHead.next != null) {
					tempHead = tempHead.next;
					if (count >= n) {
						if (tempTail.next != null) {
							prevTotempTail = tempTail;
							tempTail = tempTail.next;
						} else {

						}
					}

				}
				count++;
				l = l.next;
			}
			if (count == n + 1) {
				return frstNode;
			} else {

				tempHead.next = frstNode;
				prevTotempTail.next = null;
				return tempTail;
			}
		} else {
			return l;
		}

	}

	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.addAtEnd(1);
		ll.addAtEnd(2);
		ll.addAtEnd(3);
		ll.addAtEnd(4);
		ll.addAtEnd(5);
		ll.addAtEnd(6);
		ll.printLinkedList(rearrangeLastN(ll.getFirstNode(), 3));

	}
}

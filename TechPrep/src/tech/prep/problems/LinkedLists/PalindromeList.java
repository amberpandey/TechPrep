package tech.prep.problems.LinkedLists;

import java.util.ArrayList;

import tech.prep.ds.LinkedLists.LinkedList;
import tech.prep.ds.LinkedLists.Node;

/**
 * Given a singly linked list of integers, determine whether or not it's a
 * palindrome.
 * 
 * Example
 * 
 * For l = [0, 1, 0], the output should be isListPalindrome(l) = true; For l =
 * [1, 2, 2, 3], the output should be isListPalindrome(l) = false.
 * 
 * @author amberpandey
 *
 */
public class PalindromeList {
	static boolean isListPalindrome(Node<Integer> l) {
		String string = "";
		boolean response = true;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while (l != null) {
			nums.add(l.value);
			l = l.next;
		}
		for (int i = 0; i < nums.size(); i++) {
			if (i <= nums.size() / 2) {
				int num1 = nums.get(i);
				int num2 = nums.get((nums.size() - 1) - i);
				if (num1 != num2) {
					response = false;
				}
			} else {
				break;
			}
		}

		return response;
	}

	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.addAtEnd(1);
		ll.addAtEnd(1000000);
		ll.addAtEnd(-1000000);
		ll.addAtEnd(-1000000);
		ll.addAtEnd(1000000);
		ll.addAtEnd(1);
		System.out.println(isListPalindrome(ll.getFirstNode()));

	}

}

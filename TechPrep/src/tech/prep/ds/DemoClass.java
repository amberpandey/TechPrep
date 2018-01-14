package tech.prep.ds;

import tech.prep.ds.LinkedLists.LinkedList;
import tech.prep.ds.stack.Stack;
import tech.prep.stringsarray.PermutationStrings;
import tech.prep.stringsarray.RepeatingCharInString;

public class DemoClass {

	public static void main(String args[]){
		LinkedList ll= new LinkedList();
		ll.addAtEnd(2);
		ll.addAtEnd(3);
		ll.addAtEnd(6);
		ll.insertatPos(2, 7);
		ll.insertAtBegin(36);
		System.out.println(ll.getNodeValue(1));
		System.out.println(ll.getNodeValue(2));
		System.out.println(ll.getNodeValue(3));
		System.out.println(ll.getNodeValue(4));
		System.out.println(ll.getNodeValue(5));
		
		/**
		 * 
		 */
		RepeatingCharInString rcis=new RepeatingCharInString();
		System.out.println(rcis.CheckString("asdfgyt123457"));
		/**
		 * 
		 */
		PermutationStrings ps= new PermutationStrings();
		System.out.println(ps.checkPermutationOfStrings("abasdfsfs", "stsdfsbaa"));
		
		/**
		 * Stacks Imple
		 */
		Stack stack =new Stack(10);
		stack.push(12);
		stack.push('j');
		stack.push(11);
		stack.push(19);
		stack.push(16);
		stack.push(1);
		stack.push(12);
		stack.push('j');
		stack.push(11);
		stack.push(19);
		stack.push(16);
		stack.push(1);
		stack.pop();
		
	}
}
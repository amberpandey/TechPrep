package tech.prep.datastructures;

import tech.prep.datastructures.LinkedList.LinkedList;
import tech.prep.stringsarray.PermutationStrings;
import tech.prep.stringsarray.RepeatingCharInString;

public class DemoClass {

	public static void main(String args[]){
		LinkedList ll= new LinkedList();
		ll.addAtEnd(2);
		ll.addAtEnd(3);
		ll.addAtEnd(6);
		ll.insertatPos(2, 7);
		System.out.println(ll.getNodeValue(2));
		System.out.println(ll.getNodeValue(3));
		
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
		
	}
}

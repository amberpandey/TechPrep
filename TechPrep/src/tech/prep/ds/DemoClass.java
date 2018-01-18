package tech.prep.ds;

import tech.prep.ds.LinkedLists.Singlelinkedlist.SingleLinkedList;
import tech.prep.ds.LinkedLists.circularLinkedlist.CircularLinkedList;
import tech.prep.ds.LinkedLists.doublyLinkedList.DoublyLinkedList;
import tech.prep.ds.stack.Stack;
import tech.prep.stringsarray.PermutationStrings;
import tech.prep.stringsarray.RepeatingCharInString;

public class DemoClass {

	public static void main(String args[]) {
		// LinkedList ll= new LinkedList();
		// ll.addAtEnd(2);
		// ll.addAtEnd(3);
		// ll.addAtEnd(6);
		// ll.insertatPos(2, 7);
		// ll.insertAtBegin(36);
		// System.out.println(ll.getNodeValue(1));
		// System.out.println(ll.getNodeValue(2));
		// System.out.println(ll.getNodeValue(3));
		// System.out.println(ll.getNodeValue(4));
		// System.out.println(ll.getNodeValue(5));

		/**
		 * 
		 */
		CircularLinkedList cll = new CircularLinkedList();
/*		cll.addNodeatEnd(1);
		cll.addNodeatEnd(2);
		cll.addNodeatEnd(3);
		cll.addNodeatEnd(4);
		cll.addNodeatEnd(5);
		cll.addNodeatEnd(6);
		System.out.println(cll.size());
		cll.deleteFromPos(1);
		cll.deleteFromPos(1);
		cll.deleteFromPos(1);
		cll.deleteFromPos(1);
		cll.deleteFromPos(1);
		cll.deleteFromPos(1);
		cll.deleteFromPos(1);
		cll.deleteFromPos(1);*/
		
		DoublyLinkedList dll= new DoublyLinkedList();
		
		SingleLinkedList sll= new SingleLinkedList();
		sll.addAtBegin(1);
		sll.addAtBegin(2);
		sll.addAtBegin(3);
		sll.addAtBegin(4);
		sll.addAtBegin(5);
		sll.addAtBegin(6);
		sll.addAtLast(7);
		sll.addAtLast(8);
		sll.addAtLast(9);
		System.out.println("sll");
		sll.printLinkedList();
		sll.deleteFromHead();
		sll.deleteFromHead();
		System.out.println("sll");
		sll.printLinkedList();
		sll.deleteFromTail();
		sll.deleteFromTail();
		System.out.println("sll");
		sll.printLinkedList();
		System.out.println("size  ::"+sll.size());
/*		System.out.println(dll.isEmpty());
		System.out.println(dll.size());
		dll.addToTail(1);
		dll.addToTail(2);
		dll.addToTail(3);
		dll.addToTail(4);
		dll.addToTail(5);
		dll.addToTail(6);
		dll.addToHead(7);
		dll.addToHead(8);
		System.out.println(dll.isEmpty());
		System.out.println(dll.size());
		System.out.println("LL");
		dll.printLinkedList();
		dll.deleteFromHead();
		System.out.println("LL1");
		dll.printLinkedList();
		System.out.println("LL2");
		dll.deleteFromTail();
		dll.printLinkedList();
		System.out.println("REVERSE");
		dll.printReverseLinkedList();
		// cll.deleteFromBegin();
		// cll.deleteFromLast();
		// cll.deleteFromLast();
		System.out.println("CircularLinkedList");
		cll.printLinkedList();*/
		/**
		 * 
		 */
		RepeatingCharInString rcis = new RepeatingCharInString();
		System.out.println(rcis.CheckString("asdfgyt123457"));
		/**
		 * 
		 */
		PermutationStrings ps = new PermutationStrings();
		System.out.println(ps.checkPermutationOfStrings("abasdfsfs", "stsdfsbaa"));

		/**
		 * Stacks Imple
		 */
		Stack stack = new Stack(10);
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

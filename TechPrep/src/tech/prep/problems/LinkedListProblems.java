package tech.prep.problems;

import tech.prep.ds.LinkedLists.Node;

public class LinkedListProblems {
	static Node<Integer> removeKFromList(Node<Integer> l, int k) {
	    Node temp=l;
	    if(l!=null&&l.value==k){
	    temp=l.next;
	    }
	while(l!=null&&l.next!=null){
	    if(l.next.value==k){
	    l.next=l.next.next;
	    }
	    temp.value=l.value;
	    temp.next=l;
	    l=l.next;
	}
	    return temp;
	}
	
	public static void main(String args[]) {
		// LinkedList ll= new LinkedList();
		// ll.addAtEnd(2);
		// ll.addAtEnd(3);
		// ll.addAtEnd(6);
		// ll.insertatPos(2, 7);
		// ll.insertAtBegin(36);
	}
}

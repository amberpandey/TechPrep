package tech.prep.problems;

import tech.prep.ds.LinkedLists.LinkedList;
import tech.prep.ds.LinkedLists.Node;

public class ReArrangeLastN {
	static Node<Integer> rearrangeLastN(Node<Integer> l, int n) {
		 Node<Integer> t=l;
		int size=0;
		  while(l!=null){
		   size++;
		   l=l.next;
		   // numList.add(l.value); 
		  }
		 int count=1;
		Node<Integer> response=null ;
		 Node<Integer> firstNode=null;
		 if(size>1&&n<size){
		  firstNode=null;
		 while(t!=null){
		  count++;
		  if(size-count==n){
		   Node<Integer> temp=firstNode;
		   firstNode=t;
		   firstNode.next=temp;
		    Node<Integer> temp1=t;
		    t=t.next;
		    temp1.next=null;
		  }else if(size-count>n){
		   if(response==null){
		    firstNode=t;
		    response=t;
		    t=t.next;
		   }else{
		    response.next=t;
		    response=response.next;
		    t=t.next;
		   }
		  }else{
		    Node<Integer> temp=firstNode.next;
		   firstNode.next=t;
		   Node<Integer> temp1=t;
		   t.next=temp;
		    t=temp1.next;
		  }
		 }
		 }else{
		  firstNode=t;
		 }
		 return firstNode;
		}
	
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.addAtEnd(1);
		ll.addAtEnd(2);
		ll.addAtEnd(3);
		ll.addAtEnd(4);
		ll.addAtEnd(5);
		ll.addAtEnd(6);
		ll.printLinkedList(rearrangeLastN(ll.getFirstNode(),2));

	}
}

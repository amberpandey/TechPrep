package tech.prep.problems;

import java.math.BigDecimal;

import tech.prep.ds.LinkedLists.LinkedList;
import tech.prep.ds.LinkedLists.Node;

public class AddBigNumber {
	static Node<Integer> addTwoHugeNumbers(Node<Integer> a, Node<Integer> b) {
		Node<Integer> res=null;
		Node<Integer> first=null;
		  int carry=0;
		  int length = String.valueOf(a.value).length();
		while(a!=null||b!=null)  {
		  int ia=0;
		  int ib=0;  
			if(a!=null){
		      ia=a.value;
			}
			if(b!=null){
		      ib=b.value;
			}
		  int nVal= (ia+ib+carry)%(int)Math.pow(10,length);
		  carry=(ia+ib)/(int)Math.pow(10,length);
		        
		  Node<Integer> temp= new Node<Integer>(nVal);

		    if(res==null){
		      res=temp;
		      first=temp;
		    }else{
		      res.next=temp;
		      res=res.next;
		    }
		}
		  if(carry!=0){
			  Node<Integer> temp= new Node<Integer>(carry);
		    res.next=temp;
		  }
		    return first;
		}
	
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		LinkedList ll2 = new LinkedList();
		ll.addAtEnd(9999);
		ll.addAtEnd(9999);
		ll.addAtEnd(9999);
		ll.addAtEnd(9999);
		ll.addAtEnd(9999);
		ll.addAtEnd(9999);
		ll2.addAtEnd(1);
		ll.printLinkedList(addTwoHugeNumbers(ll.getFirstNode(),ll2.getFirstNode()));

	}
}

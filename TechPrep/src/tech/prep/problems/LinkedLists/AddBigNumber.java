package tech.prep.problems.LinkedLists;

import java.math.BigDecimal;

import tech.prep.ds.LinkedLists.LinkedList;
import tech.prep.ds.LinkedLists.Node;
/**
 * You're given 2 huge integers represented by linked lists. Each linked list
 * element is a number from 0 to 9999 that represents a number with exactly 4
 * digits. The represented number might have leading zeros. Your task is to add
 * up these huge integers and return the result in the same format.
 * 
 * Example
 * 
 * For a = [9876, 5432, 1999] and b = [1, 8001], the output should be
 * addTwoHugeNumbers(a, b) = [9876, 5434, 0].
 * 
 * Explanation: 987654321999 + 18001 = 987654340000.
 * 
 * For a = [123, 4, 5] and b = [100, 100, 100], the output should be
 * addTwoHugeNumbers(a, b) = [223, 104, 105].
 * 
 * Explanation: 12300040005 + 10001000100 = 22301040105.
 * 
 * @author amberpandey
 *
 */
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

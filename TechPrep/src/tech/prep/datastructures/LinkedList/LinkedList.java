package tech.prep.datastructures.LinkedList;

public class LinkedList {
	Node head=null;
	Node tail=null;
	
	public LinkedList(){}
	/**
	 * Add Node at the end of existing linked list
	 * @param value
	 */
	public void addAtEnd(int value){
		Node temp = new Node();
		temp.value=value;
		if (head ==null){
			head=temp;
			head.nextNode=tail;
			tail=head;			
		}else{
			tail.nextNode=temp;
			tail=tail.nextNode;
		}
	}

}

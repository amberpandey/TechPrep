package tech.prep.ds.LinkedLists.Singlelinkedlist;

import tech.prep.ds.LinkedLists.Node;

public class SingleLinkedList {
	Node firstNode;
	int size;
	
	public SingleLinkedList(){
		this.size=0;
	}
	/**
	 * 
	 * @param val
	 */
	public void addAtLast(int val){
		size++;
		if(firstNode==null){
			firstNode=new Node(val);
			return;
		}
		//Assigning value to new Node next pointer will be null by default as per our Node class constructor
		Node newNode=new Node(val);
		//get temporary node as first and iterate over it till it reaches last node.
		Node temp=firstNode;
		while(temp.next!=null){
			temp=temp.next;
		}
		//assign next Node Pointer of last node as new Node;
		temp.next=newNode;
	}
	/**
	 * 
	 * @param val
	 */
	public void addAtBegin(int val){
		size++;
		if(firstNode==null){
			firstNode=new Node(val);
			return;
		}
		Node temp = new Node(val);
		temp.next=firstNode;
		firstNode=temp;
	}
	/**
	 * 
	 */
	 public void deleteFromHead(){
		if(firstNode==null){
			return;
		}else{
			size--;
			if(firstNode.next!=null){
				firstNode=firstNode.next;
				return;
			}
			firstNode=null;
		}
	 }
	 /**
	  * 
	  */
	 public void deleteFromTail(){
		 if(firstNode==null){
			 return;
		 }
		 size--;
		 Node temp =firstNode;
		 Node prevToTail=null;
		 while(temp.next!=null){
			 temp=temp.next;
			 prevToTail=temp;
		 }
		 prevToTail.next=null;
	 }
	 /**
	  * 
	  */
	 public void printLinkedList(Node frstNode){
		 if(frstNode==null){
			 return;
		 }
		 Node<Integer> temp =frstNode;
		 while(temp!=null){
			 System.out.println(temp.value);
			 temp=temp.next;
		 }
	 }
	 /**
	  * 
	  * @return
	  */
	 public int size(){
		 return size;
	 }

}

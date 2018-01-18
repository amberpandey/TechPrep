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
		//Assigning value to new Node nextNode pointer will be null by default as per our Node class constructor
		Node newNode=new Node(val);
		//get temporary node as first and iterate over it till it reaches last node.
		Node temp=firstNode;
		while(temp.nextNode!=null){
			temp=temp.nextNode;
		}
		//assign next Node Pointer of last node as new Node;
		temp.nextNode=newNode;
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
		temp.nextNode=firstNode;
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
			if(firstNode.nextNode!=null){
				firstNode=firstNode.nextNode;
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
		 while(temp.nextNode!=null){
			 temp=temp.nextNode;
			 prevToTail=temp;
		 }
		 prevToTail.nextNode=null;
	 }
	 /**
	  * 
	  */
	 public void printLinkedList(){
		 if(firstNode==null){
			 return;
		 }
		 Node temp =firstNode;
		 while(temp!=null){
			 System.out.println(temp.value);
			 temp=temp.nextNode;
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

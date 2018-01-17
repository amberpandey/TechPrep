package tech.prep.ds.LinkedLists.Singlelinkedlist;

import tech.prep.ds.LinkedLists.Node;

public class SingleLinkedList {
	Node firstNode;
	int size;
	
	SingleLinkedList(){
		this.size=0;
	}
	/**
	 * 
	 * @param val
	 */
	public void addAtLast(int val){
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

}

package tech.prep.ds.LinkedLists.doublyLinkedList;

import tech.prep.ds.LinkedLists.DNode;

public class DoublyLinkedList {
	DNode firstNode;
	int size;

	public DoublyLinkedList() {
		this.size=0;
	}
/**
 * 
 * @param val
 */
	public void addToTail(int val) {
		DNode newNode = new DNode(val);
		if(firstNode==null){
			firstNode=newNode;
			return;
		}
		DNode temp=firstNode;
		while(temp.nextNode!=null){
			temp=temp.nextNode;
		}
		temp.nextNode=newNode;
		newNode.prevNode=temp;
	}
	/**
	 * 
	 * @param val
	 */
	public void addToHead(int val) {
		DNode newNode = new DNode(val);
		if(firstNode==null){
			firstNode=newNode;
			return;
		}
		newNode.nextNode=firstNode;
		firstNode.prevNode=newNode;
		firstNode=newNode;
	}
	
	public void printLinkedList(){
		DNode temp=firstNode;
		while(temp.nextNode!=null){
			System.out.println(temp.value);
			temp=temp.nextNode;
		}
		System.out.println(temp.value);
		System.out.println(temp.prevNode.value);
	}
	
}

package tech.prep.ds.LinkedLists.circularLinkedlist;

import tech.prep.ds.LinkedLists.Node;

public class CircularLinkedList {
	Node firstNode;
	Node lastNode;
	int size;

	public CircularLinkedList() {
	}

	/**
	 * 
	 * @param val
	 */
	public void addNodeatEnd(int val) {
		Node temp = new Node(val);
		if (firstNode == null) {
			firstNode = temp;
			firstNode.nextNode = lastNode;
			lastNode = firstNode;
		} else {
			lastNode.nextNode = temp;
			lastNode = temp;
			lastNode.nextNode = firstNode;
		}
		size++;
	}

	/**
	 * 
	 * @param val
	 */
	public void addatHead(int val) {
		Node temp = new Node(val);
		temp.nextNode = firstNode;
		firstNode = temp;
		size++;
	}

	/**
	 * 
	 * @param pos
	 * @param val
	 */
	public void addAtPos(int pos, int val) {
		Node temp = new Node(val);
		int count = 0;
		Node nodeAtPos = firstNode;
		while (count != pos) {
			nodeAtPos = nodeAtPos.nextNode;
			count++;
		}
		temp.nextNode = nodeAtPos.nextNode;
		nodeAtPos.nextNode = temp;
		size++;
	}

	/**
	 * 
	 */
	public void deleteFromBegin() {
		lastNode.nextNode = firstNode.nextNode;
		firstNode = firstNode.nextNode;
		size--;
	}

	/**
	 * 
	 */
	public void deleteFromLast() {
		Node secLastNode = firstNode;
		while (secLastNode.nextNode != lastNode) {
			secLastNode = secLastNode.nextNode;
		}
		lastNode = secLastNode;
		lastNode.nextNode = firstNode;
		size--;
	}

	/**
	 * 
	 * @param pos
	 */
	public void deleteFromPos(int pos) {
		Node prevNode = firstNode;
		int count =1;
		if(pos==1){
			lastNode.nextNode = firstNode.nextNode;
			firstNode = firstNode.nextNode;
			size--;	
		}
		while (count <pos-1) {
			prevNode = prevNode.nextNode;
			count++;
		}
		prevNode.nextNode = prevNode.nextNode.nextNode;
		size--;
	}

	/**
	 * 
	 */
	public int size() {
		return size;
	}

	/**
	 * 
	 */
	public void printLinkedList() {
		Node prevNode = firstNode;
		while (prevNode != lastNode) {
			System.out.println(prevNode.value);
			prevNode = prevNode.nextNode;
		}
		System.out.println(lastNode.value);
	}

}

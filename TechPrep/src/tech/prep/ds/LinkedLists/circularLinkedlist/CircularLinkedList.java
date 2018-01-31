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
			firstNode.next = lastNode;
			lastNode = firstNode;
		} else {
			lastNode.next = temp;
			lastNode = temp;
			lastNode.next = firstNode;
		}
		size++;
	}

	/**
	 * 
	 * @param val
	 */
	public void addatHead(int val) {
		Node temp = new Node(val);
		temp.next = firstNode;
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
			nodeAtPos = nodeAtPos.next;
			count++;
		}
		temp.next = nodeAtPos.next;
		nodeAtPos.next = temp;
		size++;
	}

	/**
	 * 
	 */
	public void deleteFromBegin() {
		lastNode.next = firstNode.next;
		firstNode = firstNode.next;
		size--;
	}

	/**
	 * 
	 */
	public void deleteFromLast() {
		Node secLastNode = firstNode;
		while (secLastNode.next != lastNode) {
			secLastNode = secLastNode.next;
		}
		lastNode = secLastNode;
		lastNode.next = firstNode;
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
			lastNode.next = firstNode.next;
			firstNode = firstNode.next;
			size--;	
		}
		while (count <pos-1) {
			prevNode = prevNode.next;
			count++;
		}
		prevNode.next = prevNode.next.next;
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
			prevNode = prevNode.next;
		}
		System.out.println(lastNode.value);
	}

}

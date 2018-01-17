package tech.prep.ds.LinkedLists.doublyLinkedList;

import tech.prep.ds.LinkedLists.DNode;

public class DoublyLinkedList {
	DNode firstNode;
	DNode lastNode;
	int size;

	public DoublyLinkedList() {
		this.size = 0;
	}

	/**
	 * 
	 * @param val
	 */
	public void addToTail(int val) {
		size++;
		DNode newNode = new DNode(val);
		if (isEmpty()) {
			firstNode = newNode;
			lastNode = firstNode;
			return;
		}
		lastNode.nextNode = newNode;
		newNode.prevNode = lastNode;
		lastNode = newNode;
		;
	}

	/**
	 * 
	 * @param val
	 */
	public void addToHead(int val) {
		size++;
		DNode newNode = new DNode(val);
		if (isEmpty()) {
			firstNode = newNode;
			return;
		}
		newNode.nextNode = firstNode;
		firstNode.prevNode = newNode;
		firstNode = newNode;
	}

	/**
	 * 
	 */
	public void deleteFromHead() {
		if (!isEmpty()) {
			size--;
			firstNode = firstNode.nextNode;
			lastNode.nextNode = firstNode;
		}
	}

	/**
	 * 
	 */
	public void deleteFromTail() {
		if (!isEmpty()) {
			size--;
			lastNode.prevNode.nextNode = firstNode;
			lastNode=lastNode.prevNode;
		}
	}

	/**
	 * 
	 */
	public void printLinkedList() {
		DNode temp = firstNode;
		while (temp != lastNode) {
			System.out.println(temp.value);
			temp = temp.nextNode;
		}
		System.out.println(temp.value);
	}

	/**
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return firstNode == null;
	}

	/**
	 * 
	 */
	public void printReverseLinkedList() {
		DNode temp = lastNode;
		while (temp != firstNode) {
			System.out.println(temp.value);
			temp = temp.prevNode;
		}
		System.out.println(temp.value);
	}
}

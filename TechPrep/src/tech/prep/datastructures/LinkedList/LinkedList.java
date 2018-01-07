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
	/**
	 * 
	 * @param pos
	 * @param value
	 */
	public void insertatPos(int pos,int value){
		Node current=head;
		Node temp = new Node();
		int count =1;
		while(count<pos-1){
			current=current.nextNode;
			count++;
		}
		temp.value=value;
		temp.nextNode=current.nextNode;
		current.nextNode=temp;
	}
	/**
	 * 
	 * @param pos
	 * @return
	 */
	public int getNodeValue(int pos){
		Node current =head;
		int count=1;
		if(pos<0){
			return 0;
		}
		while(count<pos){
			if(current.nextNode==null){
				return 0;
			}
			current=current.nextNode;
			count++;
		}
		return current.value;
		
	}

}

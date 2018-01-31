package tech.prep.ds.LinkedLists;

public class LinkedList {
	Node head=null;
	Node tail=null;
	
	public LinkedList(){}
	/**
	 * Add Node at the end of existing linked list
	 * @param value
	 */
	public void addAtEnd(int value){
		Node temp = new Node(value);
		if (head ==null){
			head=temp;
			head.next=tail;
			tail=head;			
		}else{
			tail.next=temp;
			tail=temp;
		}
	}
	/**
	 * 
	 * @param pos
	 * @param value
	 */
	public void insertatPos(int pos,int value){
		Node current=head;
		Node temp = new Node(value);
		int count =1;
		while(count<pos-1){
			current=current.next;
			count++;
		}
		temp.next=current.next;
		current.next=temp;
	}
	/**
	 * 
	 */
	public void insertAtBegin(int val){
		Node temp = new Node(val);
		temp.next=head;
		head=temp;
		
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
			if(current.next==null){
				return 0;
			}
			current=current.next;
			count++;
		}
		return current.value;
		
	}
	
	

}

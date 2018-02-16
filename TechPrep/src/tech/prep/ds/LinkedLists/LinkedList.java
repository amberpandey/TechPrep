package tech.prep.ds.LinkedLists;

public class LinkedList<k> {
	Node<k> head=null;
	Node<k> tail=null;
	
	public LinkedList(){}
	/**
	 * Add Node at the end of existing linked list
	 * @param value
	 */
	public void addAtEnd(k value){
		Node<k> temp = new Node<k>(value);
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
	public void insertatPos(int pos,k value){
		Node<k> current=head;
		Node<k> temp = new Node<k>(value);
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
	public void insertAtBegin(k val){
		Node<k> temp = new Node<k>(val);
		temp.next=head;
		head=temp;
		
	}
	/**
	 * 
	 * @param pos
	 * @return
	 */
	public k getNodeValue(int pos){
		Node<k> current =head;
		int count=1;
		if(pos<0){
			return null;
		}
		while(count<pos){
			if(current.next==null){
				return null;
			}
			current=current.next;
			count++;
		}
		return current.value;
		
	}
	public Node<k> getFirstNode(){
return head;
		
	}
	
	 public void printLinkedList(Node<k> frstNode){
		 if(frstNode==null){
			 return;
		 }
		 Node<k> temp =frstNode;
		 while(temp!=null){
			 System.out.println(temp.value);
			 temp=temp.next;
		 }
	 }
	

}

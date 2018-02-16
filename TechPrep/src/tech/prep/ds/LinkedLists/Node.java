package tech.prep.ds.LinkedLists;


public  class Node<k>{
	public k value;
	public  Node<k> next;
	
	public Node (k val){
		this.value= val;
		next=null;
	}
}
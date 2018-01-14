package tech.prep.ds.que;

public class Que {
	private int head;
	private int tail;
	private int noOfItems;
	private int maxLength;
	private int[] queArray;
	/**
	 * 
	 * @param maxLength
	 */
	public Que(int maxLength){
		this.maxLength=maxLength;
		this.queArray=new int[maxLength];
		this.head=0;
		noOfItems=0;
		this.tail=-1;
	}
	
	public void push(int val){
		
		this.tail++;
		queArray[this.tail]=val;
	}
	/**
	 * 
	 * @return
	 */
	public int pop(){
		int val=this.queArray[head];
		head++;
		if(head==maxLength){
			head=0;
		}
		noOfItems--;
		return val;
	}
	
	

}

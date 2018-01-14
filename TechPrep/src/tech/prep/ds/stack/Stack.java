package tech.prep.ds.stack;

public class Stack {
	private int length;
	private long[] stackArray;
	private int top;
	public Stack(int length){
		this.length=length;
		this.stackArray=new long[length];
		this.top=-1;
	}
	/**
	 * 
	 */
	public void push(long val){
		if(isFull()){
			System.out.println("Stack is Already full");
		}else{
			top++;
			this.stackArray[top]= val;

		}
		
	}
	/**
	 * 
	 * @return
	 */
	public long pop(){
		if(isEmpty()){
			System.out.println("Stack is Already full");
			return -1;
		}else{
		int oldtop=this.top;
		top--;
		return this.stackArray[oldtop];
		}
	}
	/**
	 * 
	 */
	public void popFullStack(){
		while(!isEmpty()){
			System.out.println(pop());
		}
	}
	/**
	 * 
	 */
	public void printFullStack(){
		int currentTop=top;
		while(!isEmpty()){
			System.out.println(pop());
		}
		top=currentTop;
	}
	/**
	 * 
	 * @return
	 */
	public long peak(){
	return stackArray[top];	
	}
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty(){
		return(top==-1);
		
	}
	/**
	 * 
	 * @return
	 */
	public boolean isFull(){
		return(length-1==top);	
	}

}

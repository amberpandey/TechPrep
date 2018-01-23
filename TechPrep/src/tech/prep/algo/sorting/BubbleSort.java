package tech.prep.algo.sorting;

public class BubbleSort {

	public static int[] sort(int[] arr){
		for(int j=0;j<arr.length;j++){
			boolean swapped=false;
		for(int i=0; i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				int temp= arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
				swapped=true;
			}
		}
		if(!swapped)return arr;
		}
		return arr;
	}
	
	public static void main(String[] args){
		int[] arr= {2,5,9,3,1,7,6};
		
		for(int i:sort(arr)){
			System.out.println(i);	
		}
	}
}

package tech.prep.algo.sorting;

public class SelectionSort {
	public static int[] sort(int[] arr) {
		for(int i=0;i<arr.length;i++){
			int minindex=i;
			boolean minAvailable=false;
			for(int j=i;j<arr.length;j++){
				if(arr[j]<arr[minindex]){
					minindex=j;
					minAvailable=true;
				}
			}
			if(!minAvailable)return arr;
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
			
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

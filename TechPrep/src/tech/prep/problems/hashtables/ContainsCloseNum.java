package tech.prep.problems.hashtables;

import java.util.HashMap;

public class ContainsCloseNum {
	static boolean containsCloseNums(int[] nums, int k) {
	    HashMap<Integer,Integer> intmap=new HashMap<Integer,Integer>();
	for (int i=0;i<nums.length;i++){
	    if(intmap.get(nums[i])!=null){
	     if(i-intmap.get(nums[i])<=k){
	      return true;   
	     }else{
	     intmap.put(nums[i],i); 
	     }   
	    }else{
	      intmap.put(nums[i],i);  
	    }
	        

	}
	            return false;
	}
	
	public static void main(String args[]){
		int[] nums={0, 1, 2, 3, 5, 2};
		System.out.println(containsCloseNums(nums,3));
	}

}

package tech.prep.problems;

import java.util.ArrayList;

public class getMaxSet {
	    static  ArrayList<Integer> maxset(ArrayList<Integer> A) {
	        ArrayList<Integer> maxset= new ArrayList<Integer>();
	        ArrayList<Integer> premaxset= new ArrayList<Integer>();
	        long maxSum=0;
	        long sum=0;
	        for(int i:A){
	            if(i>=0){
	            sum=i+sum;
	            premaxset.add(i);
	            }else{
	                if(sum>maxSum){
	                maxSum=sum;
	                maxset=new ArrayList<Integer>(premaxset);
	                premaxset.clear();
	                sum=0;
	            }else if(sum == maxSum){
	                if(maxset.size()<premaxset.size()){
	                  maxset=new ArrayList<Integer>(premaxset);
	                  premaxset.clear();
	                  sum=0;
	                }
	            }

	            }
	        }

	        return maxset;
	  
	    }
	public static void main(String args[]){
		ArrayList<Integer> maxset= new ArrayList<Integer>();
		maxset.add(756898537);
		maxset.add(-1973594324);
		maxset.add(-1967513926);
		maxset.add(1424268980);
		for(int i:maxset(maxset)){
			System.out.println(i);
		}
	}

}

package tech.prep.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class numberEqualCountofLargerNum {
	    static int solve(ArrayList<Integer> A) {
	           Set<Integer> B = new HashSet<Integer>();
	        for(int i:A){
	            B.add(i);
	            
	        }
	    int count=0;
	    Iterator<Integer> it = B.iterator();
	     while(it.hasNext()){
	         count++;
	          if(it.next()==B.size()-count)return 1;
	     }
	        return -1;
	    }
	    
	    public static void main(String args[]){
	    	ArrayList<Integer> B = new ArrayList<Integer>();
	    	B.add(4);
	    	B.add(-1);
	    	B.add(-2);
	    	B.add(0);
	    	B.add(-6);
	    	System.out.println(solve(B));
	    }
}

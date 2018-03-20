package tech.prep.problems.hashtables;

import java.util.ArrayList;
import java.util.HashSet;

public class PossibleSums {
	
	static int possibleSums(int[] coins, int[] quantity) {
		HashSet<Integer> map= new HashSet<Integer>();
		int size=0;
		ArrayList<Integer> allCoins=new ArrayList<Integer>();
		    for(int i=0; i<coins.length;i++){
		            	size= storeUniqueVal(coins[i], map);
		    }
		    for(int i=0;i<quantity.length;i++){
		    	if(quantity[i]>1){
		    		int tempSize=size;
		    		size=storeUniqueVal(coins[i],map);	
		    		int diff=size-tempSize;
		    		size=tempSize+((quantity[i]-1)*diff);
		    	}
		    }
		    return size;
		}
	
	 static int storeUniqueVal(int num,HashSet<Integer> map){
		 HashSet<Integer> tempMap=(HashSet<Integer>) map.clone();
		 int count=0;
		   for (Integer s : tempMap) {
				   map.add(num+s);
		    }
			 map.add(num);
		return map.size();
	}
	 
	static int storeUniqueValq(int num,HashSet<Integer> map,int size){
		 HashSet<Integer> tempMap=(HashSet<Integer>) map.clone();
		 int count=0;
		   for (Integer s : tempMap) {
				   map.add(num+s);
		    }
			 map.add(num);
		return map.size();
	}
	public static void main(String args[]){
		long time=System.currentTimeMillis();
		int[] coins ={1,2};
		int[] quantity={50000,2};
//		int ans=possibleSums(coins,quantity);
		long runtime=System.currentTimeMillis()-time;
//		System.out.println(ans+"   runtime="+runtime);
		
		time=System.currentTimeMillis();
		int ans=brutPossibleSums(coins,quantity);
		runtime=System.currentTimeMillis()-time;
		System.out.println(ans+"   runtime="+runtime);
	}
	
	static int brutPossibleSums(int[] coins, int[] quantity) {
	    HashSet<Integer> map= new HashSet<Integer>();
			int size=0;
			
			ArrayList<Integer> allCoins=new ArrayList<Integer>();
			    for(int i=0; i<quantity.length;i++){
			            int count=0;
			            size= storeUniqueVal(coins[i], map);
			            while(count<quantity[i]){
			            	long time=System.currentTimeMillis();
			            	size= storeUniqueVal(coins[i], map);
			            	System.out.println("processing time::::---->"+(System.currentTimeMillis()-time));
			            	count++; 
			            }
			    }
			    return size;
			}
	int centuryFromYear(int year) {
	    return(year%100>0?year/100+1:year/100);
	}
}

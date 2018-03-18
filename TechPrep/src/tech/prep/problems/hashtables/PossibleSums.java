package tech.prep.problems.hashtables;

import java.util.ArrayList;
import java.util.HashSet;

public class PossibleSums {
	
	static int possibleSums(int[] coins, int[] quantity) {
		HashSet<Integer> map= new HashSet<Integer>();
		int size=0;
		ArrayList<Integer> allCoins=new ArrayList<Integer>();
		    for(int i=0; i<coins.length;i++){
		            	size= storeUniqueVal(coins[i], map,quantity[i]);
		    }
		    for(Integer i:map){
		    System.out.println("--->"+i);
		    }
		    return size;
		}
	
	 static int storeUniqueVal(int num,HashSet<Integer> map,int quantity){
		 HashSet<Integer> tempMap=(HashSet<Integer>) map.clone();
		 int count=0;
		 while(count<quantity){
			 tempMap=map;
		   for (Integer s : tempMap) {
				   map.add(num+s);

		    }
			 map.add(num);
			 count++;
		 }
		   
		return map.size();
	}
	public static void main(String args[]){
		long time=System.currentTimeMillis();
		int[] coins ={10,50,100};
		int[] quantity={1,4,1};
		int ans=possibleSums(coins,quantity);
		long runtime=System.currentTimeMillis()-time;
		System.out.println(ans+"   runtime="+runtime);
		
		time=System.currentTimeMillis();
		ans=brutPossibleSums(coins,quantity);
		runtime=System.currentTimeMillis()-time;
		System.out.println(ans+"   runtime="+runtime);
	}
	
	static int brutPossibleSums(int[] coins, int[] quantity) {
	    HashSet<Integer> map= new HashSet<Integer>();
			int size=0;
			ArrayList<Integer> allCoins=new ArrayList<Integer>();
			    for(int i=0; i<coins.length;i++){
			            int count=0;
			            while(count<quantity[i]){
			            	size= storeUniqueVal(coins[i], map,1);
			            	count++;
//			                allCoins.add(coins[i]);
//			                count++;    
			            }
			    }
			    for(Integer i:map){
				    System.out.println("2--->"+i);
				    }
			    return size;
			}
}

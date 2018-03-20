package tech.prep.problems;

import java.util.HashSet;
import java.util.Set;

public class MKArrayConsecutive {
	public static void main(String args[]){
		int[] aaerr ={2,4,7,18};
		System.out.println(makeArrayConsecutive2(aaerr));
	}
	
		static int makeArrayConsecutive2(int[] statues) {
			Set<Integer> myset = new HashSet<>();
			for (int v : statues) {
			    myset.add(v);
			}
			    int totalSum=0;
			    int lastInt=-1;
			    for(Integer i:myset){
			        if(lastInt==-1){
			            lastInt=i;
			        }else{
			            totalSum+=(i-1)-lastInt;
			            lastInt=i;
			        }
			    }
			    
			    return totalSum;
			}
}

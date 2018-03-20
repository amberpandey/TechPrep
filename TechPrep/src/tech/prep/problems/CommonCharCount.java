package tech.prep.problems;

import java.util.HashMap;
import java.util.Map;

public class CommonCharCount {

	static int solve(String s1, String s2){
		char arr[]= s1.toCharArray();
		Map<Character,Integer> charCount= new HashMap<Character,Integer>();
		int sum=0;
		    for(Character c:arr){
		        int commonValue;
		        int len1=s1.length() - s1.replace(""+c, "").length();
		        int len2=s2.length() - s2.replace(""+c, "").length();
		        commonValue=len1<len2?len1:len2;
		        charCount.put(c,commonValue);
		    }
		    for (Map.Entry<Character,Integer> entry : charCount.entrySet()) {
		        sum+=entry.getValue();
		    }
		    return sum;
	}
	
	public static void main(String args[]){
		System.out.println(solve("zzzzzz","zzz"));
	}
}

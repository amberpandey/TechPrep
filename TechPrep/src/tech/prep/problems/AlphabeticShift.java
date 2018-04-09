package tech.prep.problems;

public class AlphabeticShift {
	
	static String solve(String inputString){
		for(int i=0;i<inputString.length();i++){
		    char c= inputString.charAt(i);
		    char nchar;
		    if(c=='z'){
		    nchar= 'a';
		    }else{
		    nchar= (char)(c+1);  
		    }
		    inputString= inputString.replaceFirst(""+c,""+nchar);
		    System.out.println(i+"--> "+inputString);
		}
		    return inputString;
	}
	
	public static void main(String args[]){
		System.out.println(solve("aaaaaabsdsdsdbbbbb"));
	}

}

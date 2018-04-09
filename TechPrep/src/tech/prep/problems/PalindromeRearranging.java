package tech.prep.problems;

public class PalindromeRearranging {
  static boolean solve(String inputString){
	    inputString=inputString.replace(" ","");
	    char[] stringarray=inputString.toCharArray();
	    int count =0;
	    String d=null;
	    for(char c :stringarray){
	        String cab = inputString;
	        int strength= cab.length()-(cab.replace(""+c,"")).length();
	        if(strength%2==0){
	          if(inputString.length()==2){
	              return true;
	          } 
	        }else{
	          if(d==null){ 
	            d=c+"";
	            count++;
	          }else if(d.equals(c+"")){
	            System.out.println("");  
	          }else{
	             return false;
	          }
	            
	          }
	    }
	    
	    return true;
	  
  }
  
  public static void main (String args[]){
	  System.out.println(solve("ab ba baa"));
  }
}

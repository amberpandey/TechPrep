package tech.prep.problems;

public class IsIpV4Address {

	
	static boolean solve(String ip){

	    String[] numbers=ip.split("\\.");
	    System.out.println(numbers.length );
	    if(numbers.length==4){
	        for(String i:numbers){
	            try{
	                int num= Integer.parseInt(i);
	                if(num<0||num>255){
	                    return false;
	                }
	            }catch(Exception e){
	                return false;
	            }
	        }
	    }else{
	        return false;
	    }
	    
	    return true;
	}
	
	public static void main(String args[]){
	System.out.println(solve("172.213.12.12"));	
	}
}

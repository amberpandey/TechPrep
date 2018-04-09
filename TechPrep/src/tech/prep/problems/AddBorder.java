package tech.prep.problems;

public class AddBorder {

	
	static String[] solve(String[] picture){
		    String ans[]=new String[picture.length+2];
		    int maxlength=0;
		    for(int i=1;i<ans.length-1;i++){
		     ans[i]="*"+picture[i-1]+"*";
		    maxlength=picture[i-1].length()+2;
		    }
		    ans[0]="";
		    ans[picture.length+1]="";
		    for(int i=0;i<maxlength;i++){
		      ans[0]+="*";
		        ans[picture.length+1]+="*";
		    }
		    
		    return ans;
	}
	
	public static void main(String args[]){
		String[] arr={"abc","def","hij"};
		for(String s:solve(arr)){
			System.out.println(s);
		}
	}
}

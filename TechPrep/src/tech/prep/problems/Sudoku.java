package tech.prep.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sudoku {
	static boolean sudoku2(char[][] grid) {
	    boolean response =true;
	    for(int l=0;l<grid.length;l+=3){
	         int k=0;
	        	Map<Integer, ArrayList<Character>> x = new HashMap<Integer, ArrayList<Character>>();
	    	    ArrayList<Character> columnrow1=new ArrayList<Character>();
	    	    ArrayList<Character> columnrow2=new ArrayList<Character>();
	    	    ArrayList<Character> columnrow3=new ArrayList<Character>();
	    	    x.put(l, columnrow1);
	    	    x.put(l+1, columnrow2);
	    	    x.put(l+2, columnrow3);
	        while(k<grid.length){
	            ArrayList<Character> charlist=new ArrayList<Character>();
	            for(int i=l;i<l+3;i++){
	                ArrayList<Character> column=new ArrayList<Character>();
                    for(int y=0;y<9;y++){
                    	 if(grid[i][y]!='.'){
                       if(column.contains(grid[i][y])){
                    	   return false;
                       }
                        column.add(grid[i][y]);
                    	 }
                    }
	                for(int j=k;j<k+3;j++){
	                if(grid[i][j]!='.'){
	                    if(charlist.contains(grid[i][j])||x.get(i).contains(grid[i][j]))
	                    return false;
	                    charlist.add(grid[i][j]);
	                    ArrayList b=x.get(i);
	                    b.add(grid[i][j]);
	                    x.put(i,b);
	                    }   
	                }
	            }
	            k+=3;
	        }

	          
	            
	    }
	        return response;
	      
		}
	public static void main(String args[]){
		char[][]  array = {{'O','1'}, 
				 {'T','0'}, 
				 {'W','9'}, 
				 {'E','5'}, 
				 {'N','4'}};
		String [] strs= {"TEN", 
		                 "TWO", 
		                 "ONE"};
//			{{'.','.','4' ,'.','.','.' ,'6','3','.'}, 
//					 {'.','.','.' ,'.','.','.' ,'.','.','.'}, 
//					 {'5','.','.' ,'.','.','.' ,'.','9','.'}, 
//					 
//					 {'.','.','.' ,'5','6','.' ,'.','.','.'}, 
//					 {'4','.','3' ,'.','.','.' ,'.','.','1'}, 
//					 {'.','.','.' ,'7','.','.' ,'.','.','.'}, 
//					 
//					 {'.','.','.' ,'5','.','.' ,'.','.','.'}, 
//					 {'.','.','.' ,'.','.','.' ,'.','.','.'}, 
//					 {'.','.','.' ,'.','.','.' ,'.','.','.'}};
		//char[][]  array ={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		//System.out.println(sudoku2(array));
		//printrows(array );
		isCryptSolution(strs,array);
	}
	
	
	
static boolean sudoku3(char[][] grid){
	
	return false;
}
	
	
	
	
	
	
	
	
	
	static void printrows(char[][] grid){
		for(int i=0;i<9;i++){
			List a = Arrays.asList(grid[i]);
			System.out.println(i+"------>"+Arrays.asList(grid[i]).contains(grid[4][4]));
	
		}
		char[] t=grid[4];
		Arrays.asList(t);
		System.out.println(Arrays.asList(t).size());
		for(int i=0;i<Arrays.asList(grid).get(4).length;i++){
			System.out.println(Arrays.asList(grid).get(0).length);
			System.out.println(Arrays.asList(grid).get(0));
		}
	}
	
	
	
	static boolean isCryptSolution(String[] crypt, char[][] solution) {
		String[] val={"","",""};
	    boolean response=false;
	for(int i=0;i<crypt.length;i++){
	    String strng=crypt[i];
	    char[] chars=strng.toCharArray();
	     for(int j=0;j<chars.length;j++){
	    for(int k=0;k<solution.length;k++){
	      if(chars[j]==solution[k][0]){
	          val[i]=val[i]+solution[k][1];
	          break;
	      }  
	    }
	     }
	}
	System.out.println(Integer.parseInt(val[0])+"   "+Integer.parseInt(val[1])+"  "+Integer.parseInt(val[2]));
	    if (Integer.parseInt(val[0])+Integer.parseInt(val[1])==Integer.parseInt(val[2])){
	        response= true;
	    }
	    return response;
		}

}

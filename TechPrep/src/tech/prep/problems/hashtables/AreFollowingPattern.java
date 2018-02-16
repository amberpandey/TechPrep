package tech.prep.problems.hashtables;

import java.util.HashMap;
/**
 * 
 * @author amberpandey
 *
 */
public class AreFollowingPattern {

	static boolean areFollowingPatterns(String[] strings, String[] patterns) {
		HashMap<String,String> map= new HashMap<String,String>();
		    for(int i=0;i<patterns.length;i++){
		        if(map.get(patterns[i])!=null){
		            if(!map.get(patterns[i]).equals(strings[i]))return false;
		        }else{
		            map.put(patterns[i],strings[i]);
		        }
		    }
		    HashMap<String,String> map2= new HashMap<String,String>();
		    for(int i=0;i<strings.length;i++){
		        if(map2.get(strings[i])!=null){
		            if(!map2.get(strings[i]).equals(patterns[i]))return false;
		        }else{
		            map2.put(strings[i],patterns[i]);
		        }
		    }
		    return true;
		}
	
	public static void main(String args[]){
		String strings[]= {"cat", 
		          "dog", 
		          "dog"};
		String patterns[] ={"a", 
		          "b", 
		          "b"};
		System.out.println(areFollowingPatterns(strings, patterns));
	}
}

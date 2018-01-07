package tech.prep.stringsarray;

import java.util.ArrayList;

/**
 * Class to check if given string has any repeated characters
 *
 * @author Amber
 *
 */
public class RepeatingCharInString {
	public boolean CheckString(String string){
		ArrayList<Character> charlist=new ArrayList<Character>();
		if(string.length()>128){
			return false;
		}else{
			for(int i=0;i<string.length();i++){
				if(charlist.contains(string.charAt(i))){
					return false;
				}else{
				charlist.add(string.charAt(i));
				}
			}
			
		}
		return true;
	}

}

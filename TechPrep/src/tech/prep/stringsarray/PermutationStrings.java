package tech.prep.stringsarray;

public class PermutationStrings {
	/**
	 * Method to compare 2 string and check if string2 is permutation of string1
	 * @param string1
	 * @param string2
	 * @return
	 */
	public boolean checkPermutationOfStrings(String string1, String string2){
		if(string1.length()!=string2.length())
			return false;
		int[] charArray= new int[128];
		for(int i=0; i<string1.length();i++){
			charArray[string1.charAt(i)]++;
		}
		for(int i=0; i<string2.length();i++){
			charArray[string2.charAt(i)]--;
			if(string2.charAt(i)<0)
				return false;
		}
		return true;
	}
	

}

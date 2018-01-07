package tech.prep.stringsarray;

/**
 * Class to replace spaces in string with %20
 * 
 * @author Amber
 *
 */
public class Urlify {
	/**
	 * 
	 * @param text
	 * @return
	 */
	public String urilifyString(char[] text, int truelength) {
		int noOfSpaces=0;
		for(int i=0; i<text.length;i++){
			if(text[i]==' '){
				noOfSpaces++;
			}
		}
		String urlifiedString = "";
		return urlifiedString;
	}
}

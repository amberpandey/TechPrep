package tech.prep.algo.recursionBckTrking;
/**
 * Class Implementing check for sorted Array
 * @author Amber
 *
 */
public class SortedArrayChecker {
	public static void main(String args[]) {
		SortedArrayChecker sac = new SortedArrayChecker();
		int[] anArray = { 
			    100, 400, 300,
			    400, 500, 600, 
			    700, 800, 900, 1000
			};
		System.out.println(sac.checkSortedArray(anArray,anArray.length));
	}
	/**
	 * method to check if Array is in sorted array
	 * @param array
	 * @param arraylength
	 * @return
	 */
	public boolean checkSortedArray(int[] array,int arraylength){
		if(arraylength==1)
			return true;
		return(array[arraylength-1]<=array[arraylength-2]?false:checkSortedArray(array, arraylength-1));
	}
}



package tech.prep.problems;

/**
 * This is the solution of printing all permutation in one given Array of
 * characters #Solution Approach **BackTracking** 1. We divide problems into
 * subproblems. 2. Try to solve each subproblems to reach to desired output.
 * 
 * @author amberpandey
 *
 */
public class Permutation {
	static void permute(char[] s, int l, int r) {
		if (l == r) {
			System.out.println(s);
		} else {
			for (int i = 0; i <=r; i++) {
				s=swap(s, l, i);
				permute(s, l + 1, r);
				s=swap(s, l, i);
			}
		}
	}

	/**
	 * Swap elements of Array
	 * 
	 * @param s
	 * @param index1
	 * @param index2
	 */
	static char[] swap(char[] s, int index1, int index2) {
		char temp = s[index2];
		s[index2] = s[index1];
		s[index1] = temp;
//		System.out.println(String.valueOf(s));
		return s;
	}

	public static void main(String args[]) {
		char[] s = "ABCD".toCharArray();
		permute(s, 0, 3);
	}
}

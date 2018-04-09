package tech.prep.problems;

public class ReverseParentheses {

	static String solve(String s) {

		String revString = "";
		while (s.contains("(")) {
			String stre=s.substring(s.lastIndexOf("("));
			String strToBeRev = stre.substring(stre.lastIndexOf("("), stre.indexOf(")")+1);
			System.out.println(strToBeRev);
			s=s.replace(strToBeRev, reverseString(strToBeRev));
		}
		
		return s;
	}

	static String reverseString(String strToBeRev) {
		String revString = "";
		strToBeRev=strToBeRev.replace("(","");
		System.out.println("--1   "+revString);
		strToBeRev=strToBeRev.replace(")","");
		System.out.println("--2   "+revString);
		char[] str = strToBeRev.toCharArray();
		for (int i = str.length - 1; i >= 0; i--) {
			revString += str[i];
		}
		System.out.println(revString);
		return revString;
	}

	public static void main(String args[]) {
		System.out.println(solve("abc(cba)ab(bac)c"));
	}
}

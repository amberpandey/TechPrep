package tech.prep.problems;
//Given a sorted array of integers a, find an integer x from a such that the value of
//
//abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
//is the smallest possible (here abs denotes the absolute value).
//If there are several possible answers, output the smallest one.
public class AbsoluteValueSumMinimization {
	
	static int solve(int[] a){
		int min=10000000;
		int abSum=0;
		int ans=10000000;
        for(Integer j:a){
			abSum=0;
			for(Integer i:a){
				abSum+=(i-j>=0)?i-j:j-i;
			}
			if(abSum<min){
				min=abSum;
				ans=j;
			}
		}
		
		return ans;
	}
	
	
	public static void main(String args[]){
//	int[] a= {1,1,3,4};
//	int[] b={23};
//	int[] c={1,2,3,4,5,6,7,8};
	int[] d={-1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000};
//	System.out.println(solve(a));
//	System.out.println(solve(b));
//	System.out.println(solve(c));
	System.out.println(solve(d));
	}

}

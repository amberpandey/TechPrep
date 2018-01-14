package tech.prep.algorithms.recursionBckTrking;

/**
 * Solution to Tower of Hanoi by recursion
 * 
 * @author Amber
 *
 */
public class TowerOfHanoi {

	public static void main(String args[]) {
		TowerOfHanoi twh = new TowerOfHanoi();
		twh.SolveTowerOfHanoi(4, "Source", "Destination", "Aux");
	}

	/**
	 * Method to Solve tower of hanoi problem
	 * 
	 * @param n no Of Blocks
	 * @param fromTower Source Tower
	 * @param toTower Destination Tower
	 * @param auxTower additional tower
	 */
	public void SolveTowerOfHanoi(int n, String fromTower, String toTower, String auxTower) {
		if (n == 1) {
			System.out.println("Move disc from  " + fromTower + " to  " + toTower);
			return;
		}
		SolveTowerOfHanoi(n - 1, fromTower, auxTower, toTower);
		System.out.println("2Move disc from  " + fromTower + " to  " + toTower);
		SolveTowerOfHanoi(n - 1, auxTower, toTower, fromTower);
	}

}

package comisVoiajor;

public class Main {

	private static String[] localitati = new String[] { "A", "B", "C", "D" };
	private static int[][] conexiuni = new int[][] { { 0, 1, 0, 1 }, { 0, 0, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 1, 0 } };
	private static int[] solutii = new int[localitati.length];

	public static void main(String[] args) {
		trasee(0);
	}

	private static void trasee(int k) {
		for (int i = 0; i < localitati.length; i++) {
			solutii[k] = i;
			if (valid(k)) {
				if (solutie(k)) {
					afisare();
				} else {
					trasee(k + 1);
				}
			}
		}
	}

	private static void afisare() {
		for (int i = 0; i < solutii.length; i++) {
			System.out.print(localitati[solutii[i]] + "-->");
		}		
		System.out.println();
	}

	private static boolean solutie(int k) {
		return k == solutii.length - 1;
	}

	private static boolean valid(int k) {
		if (k == 0) {
			return true;
		}
		for (int i = 0; i < k; i++) {
			if (solutii[k] == solutii[i]) {
				return false;
			}
		}
		if (conexiuni[solutii[k - 1]][solutii[k]] == 0) {
			return false;
		}
		if (k == solutii.length - 1 && conexiuni[solutii[k]][solutii[0]] == 0) {
			return false;
		}
		return true;
	}

}

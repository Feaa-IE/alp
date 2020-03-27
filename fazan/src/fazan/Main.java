package fazan;

import java.util.Arrays;

public class Main {

	private static String[] bilete = { "arici", "elefant", "iepure", };
	private static String[] solutii = new String[bilete.length];

	public static void main(String[] args) {
		fazan(0);
	}

	private static void fazan(int k) {
		for (int i = 0; i < bilete.length; i++) {
			solutii[k] = bilete[i];
			if (valid(k)) {
				if (solutie(k)) {
					afisare();
				} else {
					fazan(k + 1);
				}
			}
		}
	}

	private static void afisare() {
		System.out.println(Arrays.toString(solutii));
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
		char ultimulChar = solutii[k - 1].charAt(solutii[k - 1].length() - 1);
		char primulChar = solutii[k].charAt(0);
		if (ultimulChar != primulChar) {
			return false;
		}
		return true;
	}

}

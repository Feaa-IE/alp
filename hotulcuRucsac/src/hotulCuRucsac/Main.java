package hotulCuRucsac;

public class Main {

	private static double capacitateRucsac = 15;

	private static double[][] obiecte = new double[][] { { 2, 1 }, { 1, 1 }, { 10, 4 }, { 2, 2 }, { 4, 12 } };
	private static double[][] rucsac = new double[obiecte.length][2];

	public static void main(String[] args) {
		umpleRucsac();
	}

	private static void umpleRucsac() {
		ordoneaza(obiecte);
		for (int i = 0; i < obiecte.length; i++) {
			if (i > 0 && solutie()) {
				break;
			}
			double cantitateExistenta = cantitateRucsac();
			rucsac[i] = obiecte[i].clone();
			if (rucsac[i][1] + cantitateExistenta > capacitateRucsac) {
				rucsac[i][1] = capacitateRucsac - cantitateExistenta;
			}
		}
		if (solutie()) {
			afiseazaSolutie();
		} else {
			System.out.println("Nu exista solutie!");
		}
	}

	private static boolean solutie() {
		double cantitate = cantitateRucsac();
		return cantitate == capacitateRucsac || rucsac[rucsac.length - 1][1] == obiecte[obiecte.length - 1][1];
	}

	private static void afiseazaSolutie() {
		for (int i = 0; i < rucsac.length; i++) {
			if (rucsac[i][1] == 0) {
				break;
			}
			if (i > 0) {
				System.out.print("->");
			}
			System.out.print("[" + rucsac[i][0] + ";" + rucsac[i][1] + "]");
		}
	}

	private static double cantitateRucsac() {
		double cantitate = 0;
		for (int i = 0; i < rucsac.length; i++) {
//			if (rucsac[i][1] == 0) {
//				break;
//			}
			cantitate += rucsac[i][1];
		}
		return cantitate;
	}

	private static void ordoneaza(double[][] valori) {
		for (int i = 1; i < valori.length; i++) {
			double[] current = valori[i].clone();
			int j = i - 1;
			while (j >= 0 && valori[j][0] / valori[j][1] < current[0] / current[1]) {
				valori[j + 1] = valori[j].clone();
				j--;
			}
			valori[j + 1] = current;
		}
	}

}

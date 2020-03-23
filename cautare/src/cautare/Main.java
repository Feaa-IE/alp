package cautare;

public class Main {

	public static void main(String[] args) {

		// teste cautari

		System.out.println("Cautare secventiala");
		double[] valori = { 10, 4, 70, 20, 35, 9, 20, 14, 55 };
		double valCautata = 35;
		int gasitLa = linearSearch(valori, valCautata);
		System.out.println("Valoarea " + valCautata + " se gaseste la pozitia " + gasitLa);

		double[] valori2 = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		valCautata = 80;

		System.out.println("Cautare secventiala in vector ordonat");
		gasitLa = linearSearchInSorted(valori2, valCautata);
		System.out.println("Valoarea " + valCautata + " se gaseste la pozitia " + gasitLa);

		System.out.println("Cautare binara");
		gasitLa = binarySearch(valori2, valCautata);
		System.out.println("Valoarea " + valCautata + " se gaseste la pozitia " + gasitLa);

		System.out.println("Cautare binara recursiva");
		gasitLa = recursiveBinarySearch(0, valori2.length - 1, valori2, valCautata);
		System.out.println("Valoarea " + valCautata + " se gaseste la pozitia " + gasitLa);

		System.out.println("Cautare in arbori binari");
		BTNode nod1, nod2, nod3, nod4, nod5, nod6, nod7, nod8;
		nod8 = new BTNode(20, null, null);
		nod7 = new BTNode(17, null, nod8);
		nod6 = new BTNode(3, null, null);
		nod5 = new BTNode(9, nod6, nod7);
		nod4 = new BTNode(53, null, null);
		nod3 = new BTNode(59, null, null);
		nod2 = new BTNode(55, nod4, nod3);
		nod1 = new BTNode(45, nod5, nod2);
		//valoarea cautata este 9
		BTNode nodCautat = searchInBT(nod1, 9);
		if (nodCautat == null) {
			System.out.println("Valoarea cautata nu este in arborele binar de cautare");
		} else {
			System.out.println("S-a gasit valoarea cautata: " + nodCautat.getData());
		}

	}

	private static int linearSearch(double[] values, double toFind) {
		for (int i = 0; i < values.length; i++) {
			if (values[i] == toFind) {
				return i;
			}
		}
		return -1;
	}

	private static int linearSearchInSorted(double[] sortedValues, double toFind) {
		int i = 0;
		while (i < sortedValues.length && sortedValues[i] <= toFind) {
			i++;
		}
		if (i > 0 && sortedValues[i - 1] == toFind) {
			return i - 1;
		}
		return -1;

	}

	private static int binarySearch(double[] sortedValues, double toFind) {
		int s, d, m;
		s = 0;
		d = sortedValues.length - 1;

		while (s <= d) {
			m = (s + d) / 2;
			if (sortedValues[m] == toFind) {
				return m;
			}
			if (sortedValues[m] < toFind) {
				s = m + 1;
			} else {
				d = m - 1;
			}
		}
		return -1;
	}

	// implementare in maniera recursiva a algoritmului binarySearch
	private static int recursiveBinarySearch(int s, int d, double[] sortedValues, double toFind) {
		if (s < d) {
			int m = s + (d - s) / 2;
			if (sortedValues[m] == toFind) {
				return m;
			}
			if (toFind < sortedValues[m]) {
				return recursiveBinarySearch(s, m, sortedValues, toFind);
			}
			return recursiveBinarySearch(m + 1, d, sortedValues, toFind);
		}
		return -1;
	}

	private static BTNode searchInBT(BTNode node, int valoareCautata) {
		// verificam daca nodul curent este null 9nu are valoare) sau are valoarea
		// cautata
		// in caz afirmativ incetam cautarea si returnam nodul curent
		if (null == node || (int) node.getData() == valoareCautata) {
			return node;
		}
		// daca valoarea cautata este mai mica decat valoarea nodului curent, continuam
		// cautarea cu nodul din stanga (acesta trebuie sa stocheze o valoare mai mica)
		if (valoareCautata < (int) node.getData()) {
			return searchInBT(node.getLeft(), valoareCautata);
		}
		// daca valoarea cautata este mai mare decat valoarea nodului continuam cautarea
		// cu nodul din dreapta (pentru ca acesta trebuie sa stocheze o valoare mai
		// mare)
		return searchInBT(node.getRight(), valoareCautata);
	}

}

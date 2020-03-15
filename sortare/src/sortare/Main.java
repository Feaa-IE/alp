package sortare;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		double[] toSort = new double[] { 12, 2.7, 5, 4, 1.6, 1.9, 3.2, 10 };
		System.out.println("Vector de test:" + Arrays.toString(toSort));
		// clonam vectorul de test pentru fiecare apel de algoritm
		double[] toSort2 = toSort.clone();
		double[] toSort3 = toSort.clone();
		double[] toSort4 = toSort.clone();
		double[] toSort5 = toSort.clone();

		// apel bubble sort
		bubbleSort(toSort);
		System.out.println("Bubble sort: " + Arrays.toString(toSort));

		// apel insertion sort
		insertionSort(toSort2);
		System.out.println("Insertion sort: " + Arrays.toString(toSort2));

		// apel selection sort
		selectionSort(toSort3);
		System.out.println("Selection sort: " + Arrays.toString(toSort3));

		// apel merge sort
		mergeSort(toSort4, 0, toSort4.length - 1);
		System.out.println("Merge sort: " + Arrays.toString(toSort4));

		// apel quick sort
		quickSort(toSort5, 0, toSort5.length - 1);
		System.out.println("Quick sort: " + Arrays.toString(toSort5));
	}

	// bubble sort
	private static void bubbleSort(double[] toSort) {
		Boolean ordonat = false;
		int ultim = toSort.length - 1;
		while (!ordonat) {
			ordonat = true;
			int ultimTemp = ultim;
			for (int i = 1; i <= ultim; i++) {
				if (toSort[i] < toSort[i - 1]) {
					double temp = toSort[i - 1];
					toSort[i - 1] = toSort[i];
					toSort[i] = temp;
					ordonat = false;
					ultimTemp = i;
				}
			}
			ultim = ultimTemp;
		}
	}

	// insertion sort
	private static void insertionSort(double[] toSort) {
		for (int i = 1; i < toSort.length; i++) {
			double current = toSort[i];
			int j = i - 1;
			while (j >= 0 && current < toSort[j]) {
				toSort[j + 1] = toSort[j];
				j--;
			}
			toSort[j + 1] = current;

		}
	}

	// selection sort
	private static void selectionSort(double[] toSort) {

		for (int i = 0; i < toSort.length; i++) {
			int minIdx = i;
			for (int j = i + 1; j < toSort.length; j++) {
				if (toSort[j] < toSort[minIdx]) {
					minIdx = j;
				}
			}
			if (minIdx != i) {
				double temp = toSort[i];
				toSort[i] = toSort[minIdx];
				toSort[minIdx] = temp;
			}
		}
	}

	// merge sort
	private static void mergeSort(double[] toSort, int s, int d) {

		if (s < d) {
			int m = s + (d - s) / 2;
			mergeSort(toSort, s, m);
			mergeSort(toSort, m + 1, d);
			merge(toSort, s, m, d);
		}
	}

	private static void merge(double[] toMerge, int s, int m, int d) {
		double[] sValues = new double[m - s + 1];
		double[] dValues = new double[d - m];

		for (int i = 0; i < sValues.length; i++) {
			sValues[i] = toMerge[s + i];
		}
		for (int i = 0; i < dValues.length; i++) {
			dValues[i] = toMerge[m + 1 + i];
		}

		int j = 0, k = 0, l = s;
		while (j < sValues.length && k < dValues.length) {
			if (sValues[j] < dValues[k]) {
				toMerge[l] = sValues[j];
				j++;
			} else {
				toMerge[l] = dValues[k];
				k++;
			}
			l++;
		}

		while (j < sValues.length) {
			toMerge[l] = sValues[j];
			j++;
			l++;
		}
		while (k < dValues.length) {
			toMerge[l] = dValues[k];
			k++;
			l++;
		}

	}

	// quick sort
	private static void quickSort(double[] toSort, int s, int d) {
		if (s < d) {
			int indexPartion = partion(toSort, s, d);
			quickSort(toSort, s, indexPartion);
			quickSort(toSort, indexPartion + 1, d);
		}
	}

	private static int partion(double[] toPartition, int s, int d) {
		double pivot = toPartition[d];
		int k = s - 1;
		for (int i = s; i < d; i++) {
			if (toPartition[i] <= pivot) {
				k++;
				double temp = toPartition[k];
				toPartition[k] = toPartition[i];
				toPartition[i] = temp;
			}
		}
		double temp = toPartition[k + 1];
		toPartition[k + 1] = pivot;
		toPartition[d] = temp;
		return k;
	}

}

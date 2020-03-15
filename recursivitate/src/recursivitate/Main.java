package recursivitate;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		double[] values = new double[] { 87, 5.6, 34, 0.98, 1, 45, 8, 12 };
		// min iterativ
		double min = min(values);
		System.out.println("Min = " + min);
		// min recursiv
		min = minRec(0, values);
		System.out.println("Min rec = " + min);
		// hanoi
		System.out.println("Hanoi:");
		hanoi('A', 'B', 'C', 4);
		// fibo
		System.out.println("Fibo: ");
		long start = System.nanoTime();
		System.out.println(fibo(40));
		long end = System.nanoTime();
		System.out.println("Durata fibo: " + (end - start));

		System.out.println("Fibo iterativ: ");
		start = System.nanoTime();
		System.out.println(fiboIt(40));
		end = System.nanoTime();
		System.out.println("Durata fibo iterativ: " + (end - start));

		int n = 12345;
		System.out.println("Original: " + n);
		System.out.println("Invers: " + invers(n));

	}

	private static double min(double[] values) {
		double min = values[0];
		for (int i = 1; i < values.length; i++) {
			if (values[i] < min) {
				min = values[i];
			}
		}
		return min;
	}

	private static double minRec(int index, double[] values) {
		if (index == values.length - 1) {
			return values[index];
		}
		return Math.min(values[index], minRec(index + 1, values));
	}

	private static void hanoi(char a, char b, char c, int n) {
		if (n == 0) {
			return;
		}
		hanoi(a, c, b, n - 1);
		System.out.println("Muta discul " + n + " de la " + a + " la " + c);
		hanoi(b, a, c, n - 1);
	}

	private static int fibo(int n) {
		if (n <= 1) {
			return 1;
		}
		return fibo(n - 1) + fibo(n - 2);
	}

	private static int fiboIt(int n) {
		int prev = 1;
		int fibo = 1;

		for (int i = 2; i <= n; i++) {
			int temp = prev;
			prev = fibo;
			fibo = temp + fibo;
		}
		return fibo;
	}

	// inversul lui n - varianta recursiva
	private static int invers(int n) {
		if (n < 10) {
			return n;
		}
		return invers(n / 10) + (int) Math.pow(10, (int) Math.floor(Math.log10(n))) * (n % 10);
	}

}

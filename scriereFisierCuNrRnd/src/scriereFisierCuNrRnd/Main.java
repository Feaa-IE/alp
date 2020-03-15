package scriereFisierCuNrRnd;

import java.io.*;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		genereazaAleator(10, 1000000);

		// scrie fisier
		try {
			scrieFisier("numere.txt");
			System.out.println("Fisierul a fost creat cu succes!");
		} catch (IOException ex) {
			System.out.println("Fisierul nu a putut fi creeat!");
		}

	}

	private static int genereazaAleator(int min, int max) {

		long start = System.nanoTime();
		int aleator = (int) (min + Math.random() * (max - min));
		long end = System.nanoTime();
		System.out.println("Varianta 1 a durat: " + (end - start));

		start = System.nanoTime();
		Random rnd = new Random();
		aleator = min + rnd.nextInt(max - min);
		end = System.nanoTime();
		System.out.println("Varianta 2 a durat: " + (end - start));

		return aleator;
	}

	private static void scrieFisier(String cale) throws IOException {
		BufferedWriter scriitor = new BufferedWriter(new FileWriter(cale));
		int cateNumere = genereazaAleator(10, 100);

		while (cateNumere > 0) {
			cateNumere--;
			int numar = genereazaAleator(1000, 10000);
			scriitor.write(Integer.toString(numar));
			scriitor.newLine();
		}
		scriitor.flush();
		scriitor.close();

	}

}

package org.alp.dsaj.c7.ttuples;

public class TupleTest {

	public static void main(String[] args) {
		Pair<Integer, String> firstPair = new ArrayPair<>(1, "second");
		Pair<Integer, String> nPair = firstPair.setAt0(11);
		System.out.println("firstPair = " + firstPair);
		System.out.println("nPair = " + nPair);
		
		Pair<String, String> secondPair =  new VarPair<>("first", "second");
		Pair<Pair, Pair> thirdPair =  new ArrayPair<>(firstPair, secondPair);
		firstPair.setAt1("sir");
		 
		
		Pair<String, String> xPair =  new VarPair<>("first", "second");
		VarPair yPair = (VarPair) xPair;
		
		if (xPair instanceof ArrayPair)	{
			ArrayPair zPair = (ArrayPair) xPair;
		}
		
		System.out.println(thirdPair);
	}

}

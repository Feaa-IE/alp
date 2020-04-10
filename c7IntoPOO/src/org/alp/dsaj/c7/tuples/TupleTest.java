package org.alp.dsaj.c7.tuples;

public class TupleTest {

	public static void main(String[] args) {
		Pair firstPair = new ArrayPair(1, "second");
		Pair secondPair =  new VarPair("first", "second");
		Tuple thirdPair =  new ArrayPair(firstPair, secondPair);
		
		System.out.println(thirdPair);
	}

}

package org.alp.dsaj.c7.ttuples;

public class ArrayTriplet<A, B, C> extends Triplet<A, B, C> {
	private Object[] internalPair = new Object[3];
	
	@Override
	public A getValueAt0() {
		return (A)internalPair[0];
	}

	@Override
	public B getValueAt1() {
		return (B)internalPair[1];
	}
	
	@Override
	public C getValueAt2() {
		return (C)internalPair[2];
	}

	@Override
	public ArrayTriplet<A, B, C> setAt0(A member) {
		return new ArrayTriplet<A, B, C>(member, (B)internalPair[1], (C)internalPair[2]);
	}

	@Override
	public ArrayTriplet<A, B, C> setAt1(B member) {
		return new ArrayTriplet<A, B, C>((A)internalPair[0], member, (C)internalPair[2]);
	}
	
	@Override
	public ArrayTriplet<A, B, C> setAt2(C member) {
		return new ArrayTriplet<A, B, C>((A)internalPair[0], (B)internalPair[1], member);
	}
	
	public ArrayTriplet(A m1, B m2, C m3) {
		internalPair[0] = m1;
		internalPair[1] = m2;
		internalPair[2] = m3;
	}
}

package org.alp.dsaj.c7.ttuples;

public class VarTriplet<A, B, C> extends Triplet<A, B, C> {
	A first;
	B second;
	C third;

	@Override
	public A getValueAt0() {
		return first;
	}

	@Override
	public B getValueAt1() {
		return second;
	}
	
	@Override
	public C getValueAt2() {
		return third;
	}
	
	@Override
	public VarTriplet<A, B, C> setAt0(A member) {
		return new VarTriplet<A, B, C>(member, second, third);
	}

	@Override
	public VarTriplet<A, B, C> setAt1(B member) {
		return new VarTriplet<A, B, C>(first, member, third);
		
	}
	
	@Override
	public VarTriplet<A, B, C> setAt2(C member) {
		return new VarTriplet<A, B, C>(first, second, member);		
	}

	public VarTriplet(A first, B second, C third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}
}

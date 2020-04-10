package org.alp.dsaj.c7.ttuples;

public abstract class Triplet<A, B, C> implements Tuple {
	public abstract A getValueAt0();

	public abstract B getValueAt1();

	public abstract C getValueAt2();

	public abstract Triplet<A, B, C> setAt0(A member);

	public abstract Triplet<A, B, C> setAt1(B member);

	public abstract Triplet<A, B, C> setAt2(C member);

	public Object getValue(Integer index) {

		switch (index) {
		case 0:
			return this.getValueAt0();
		case 1:
			return this.getValueAt1();
		case 2:
			return this.getValueAt2();
		default:
			throw new RuntimeException("ERROR");
		}
	}

	public Integer getSize() {
		return 3;
	}

	//
	@Override
	public String toString() {
		return "Triplet [0: " + getValueAt0() + ", 1: " + getValueAt1() + ", 2: " + getValueAt2() +"]";
	}
}

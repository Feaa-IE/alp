package org.alp.dsaj.c7.ttuples;

public abstract class Pair<A, B> implements Tuple{
	public abstract A getValueAt0();
	public abstract B getValueAt1();

	public abstract Pair<A, B> setAt0(A member);
	public abstract Pair<A, B> setAt1(B member);
	
	public Object getValue(Integer index) { 
		if (index > 1 || index < 0)
			throw new RuntimeException("ERROR");
		Object result = (index.equals(0)) ? this.getValueAt0() : this.getValueAt1();
		return result;
	}
	
	public Integer getSize() {
		return 2;
	}
	
	//
	@Override
	public String toString() {
		return "Pair [0: " + getValueAt0() + ", 1: " + getValueAt1() + "]";
	}
}

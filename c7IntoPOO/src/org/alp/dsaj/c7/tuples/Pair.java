package org.alp.dsaj.c7.tuples;

public abstract class Pair implements Tuple{
	public abstract Object getValueAt0();
	public abstract Object getValueAt1();
	
	public abstract Pair setAt0(Object member);
	public abstract Pair setAt1(Object member);

	public Object getValue(Integer index) { 
		if (index > 1 || index < 0)
			throw new RuntimeException("ERROR");
		Object result = (index.equals(0)) ? this.getValueAt0() : this.getValueAt1();
		return result;
	}
	
	public Integer getSize() {
		return 2;
	}
	
	@Override
	public String toString() {
		return "Pair [0: " + getValueAt0() + ", 1: " + getValueAt1() + "]";
	}
}

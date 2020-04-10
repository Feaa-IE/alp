package org.alp.dsaj.c7.tuples;

public class ArrayPair extends Pair{
	private Object[] internalPair = new Object[2];
	
	@Override
	public Object getValueAt0() {
		return internalPair[0];
	}

	@Override
	public Object getValueAt1() {
		return internalPair[1];
	}

	@Override
	public ArrayPair setAt0(Object member) {
		return new ArrayPair(member, internalPair[1]);
		
	}

	@Override
	public ArrayPair setAt1(Object member) {
		return new ArrayPair(internalPair[0], member);
	}
	
	public ArrayPair(Object m1, Object m2) {
		this.internalPair[0] = m1;
		this.internalPair[1] = m2;
	}

	public ArrayPair() {
		
	}
	
	
}

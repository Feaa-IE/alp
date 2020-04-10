package org.alp.dsaj.c7.tuples;

public class VarPair extends Pair{
	private Object first;
	private Object second;

	@Override
	public Object getValueAt0() {
		return first;
	}

	@Override
	public Object getValueAt1() {
		return second;
	}

	@Override
	public VarPair setAt0(Object member) {
		return new VarPair(member, second);
		
	}

	@Override
	public VarPair setAt1(Object member) {
		return new VarPair(first, member);
		
	}

	public VarPair(Object first, Object second) {
		super();
		this.first = first;
		this.second = second;
	}

}

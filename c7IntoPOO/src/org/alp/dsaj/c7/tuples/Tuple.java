package org.alp.dsaj.c7.tuples;

//Colectie eterogena de date (imutabila)
public interface Tuple {
	Object getValue(Integer index);
	Integer getSize();
	// contains
	// toArray
}
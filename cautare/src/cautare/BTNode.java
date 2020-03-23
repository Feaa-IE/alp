package cautare;

//clasa care reprezinta un nod intr-un arbore binar
public class BTNode {
	// aceast camp/variabila va stoca valoare nodului
	// este de tip Object pentru a putea lua orice valoare de orice tip dorim
	private Object data;
	// Fiecare nod trebuie sa aiba o referinta catre cele doua noduri copil: stanga si dreapta
	private BTNode left;
	private BTNode right;

	// aceasta functie se numeste constructor, poarta numele clasei si o vom folosi pentru a da valori initiale atributelor
	public BTNode(Object data, BTNode left, BTNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	// deoarece atributele clasei sunt declarate private si nu sunt acesibile din afara clasei, vom creea metode de acces la si atribuire de valoare
	// metodele care au 'get[Nume atribut]' sunt folosite pentru a obtine valoarea respectivului atribut
	// cele care au 'set[Nume atribut]' sunt folosite pentru a seta/atribui valoare respectivului atribut
	public Object getData() {
		return data;
	}

	public BTNode getLeft() {
		return left;
	}

	public BTNode getRight() {
		return right;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}

}


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * Descripcion: clase que implementa de la interfaz pila
 * Objetivo: utilizar listas para la elaboracion de esta clase
 */

public class PilaList<E> extends AbstractPila<E> {
	
	private FactoryList<E> factoryList = new FactoryList<E>();
	
	//Instanciar objetos
	private AbstractList<E> myList;

	//Constructor
	public PilaList(String tipo){
		myList = factoryList.getLista(tipo);
	}
	
	public void push(E algo) {
		// pre:  
		// post: se agrega un elemento al stack
		myList.push(algo);	
	}

	public E pop() {
		//pre: el stack no este vacio
		//post: retira el ultimo elemento agregado
		return (E) myList.pop();
	}

	@Override
	public boolean isEmpty() {
		//pre:
		//post: regresa verdadero si y solo si el stack esta vacio
		return myList.size() == 0;
	}

}

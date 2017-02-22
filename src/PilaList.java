import java.util.LinkedList;
import java.util.List;

/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * Descripcion: clase que implementa de la interfaz pila
 * Objetivo: utilizar listas para la elaboracion de esta clase
 */

public class PilaList<E>implements iPila<E> {
	
	//Instanciar objetos
	private LinkedList<E> myList;

	//Constructor
	public PilaList(){
		myList = new LinkedList<E>();
	}
	
	@Override
	public void push(E algo) {
		// pre:  
		// post: se agrega un elemento al stack
		myList.add(algo);	
	}

	@Override
	public E pop() {
		//pre: el stack no este vacio
		//post: retira el ultimo elemento agregado
		return myList.remove(myList.size()-1);
	}

	@Override
	public boolean isEmpty() {
		//pre:
		//post: regresa verdadero si y solo si el stack esta vacio
		return myList.size() == 0;
	}

}
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * Descripcion: clase que implementa de pila, ademas esta utiliza vectores para realizar el stack
 * Objetivo: utilizar la clase vector de java
 */

public class PilaVector<E> extends AbstractPila<E> {
	
	//Instanciar el vector
	protected Vector<E> lista;
	
	//Constructores
	public PilaVector(){
		lista = new Vector(10,5);
		lista = new Vector(10);
		lista = new Vector();
		
	}

	public void push(E algo){
		// pre:  
		// post: se a�ade un elemento al stack
		lista.addElement(algo);	
		
	}
	
	public E pop(){
		//pre: el stack no este vacio
		//post: retira el ultimo elemento a�adido
		return lista.remove((lista.size()-1));
	}
	
	public boolean isEmpty(){
		//pre:
		//post: regresa verdadero si y solo si el stack esta vacio
		return lista.size() == 0;
		
	}

		
}


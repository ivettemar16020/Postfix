import java.util.ArrayList;
import java.util.Vector;


public class PilaVector<E>implements iPila<E>{
	
	protected Vector<E> lista;
	
	public PilaVector(){
		lista = new Vector(10,5);
		lista = new Vector(10);
		lista = new Vector();
		
	}

	public void push(E algo){
		// pre:  
		// post: se añade un elemento al stack
		lista.addElement(algo);	
		
	}
	
	public E pop(){
		//pre: el stack no este vacio
		//post: retira el ultimo elemento añadido
		return lista.remove((lista.size()));
	}
	
	public boolean isEmpty(){
		//pre:
		//post: regresa verdadero si y solo si el stack esta vacio
		return lista.size() == 0;
		
	}


	
}


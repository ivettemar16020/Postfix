import java.util.ArrayList;

public class PilaArray<E>implements iPila<E>{
	
	//instanciar objetos
	protected ArrayList<E> lista;
	
	//Constructor
	public PilaArray(){
		lista = new ArrayList<E>();
	}
	
	public void push(E algo){
		// pre:  
		// post: se añade un elemento al stack
		lista.add(algo);	
		
	}
	
	public E pop(){
		//pre: el stack no este vacio
		//post: retira el ultimo elemento añadido
		return lista.remove(lista.size()-1);
		
	}
	
	public boolean isEmpty(){
		//pre:
		//post: regresa verdadero si y solo si el stack esta vacio
		return lista.size() == 0;
		
	}

}

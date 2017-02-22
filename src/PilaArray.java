import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * Descripcion: clase que implementa de la interfaz pila
 * Objetivo: utilizar arraylists para la elaboracion de esta clase
 */
public class PilaArray<E> extends AbstractPila<E>{
	
	//instanciar objetos
	protected ArrayList<E> lista;
	
	//Constructor
	public PilaArray(){
		lista = new ArrayList<E>();
	}
	
	public void push(E algo){
		// pre:  
		// post: se agrega un elemento al stack
		lista.add(algo);	
		
	}
	
	public E pop(){
		//pre: el stack no este vacio
		//post: retira el ultimo elemento agregado
		return lista.remove(lista.size()-1);
		
	}
	
	public boolean isEmpty(){
		//pre:
		//post: regresa verdadero si y solo si el stack esta vacio
		return lista.size() == 0;
		
	}
}

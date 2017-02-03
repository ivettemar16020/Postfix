/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * Descripcion: clase interzas Pila 
 * Objetivo: contiene el contrato para realizar la clase pila
 */
public interface iPila<E>{
	
	/**
	 * @param algo
	 */
	public void push(E algo);
	// pre:  
	// post: se agrega un elemento al stack
	
	/**
	 * @return el ultimo elemento ingresado
	 */
	public E pop();
	//pre: el stack no este vacio
	//post: retira el ultimo elemento agregrado
	
	/**
	 * @return true en caso de estar vacio
	 */
	public boolean isEmpty();
	//pre:
	//post: regresa verdadero si y solo si el stack esta vacio
	
}



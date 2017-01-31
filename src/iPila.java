
public interface iPila<E>{
	
	public void push(E algo);
	// pre:  
	// post: se añade un elemento al stack
	
	public E pop();
	//pre: el stack no este vacio
	//post: retira el ultimo elemento añadido
	
	public boolean isEmpty();
	//pre:
	//post: regresa verdadero si y solo si el stack esta vacio
	
}



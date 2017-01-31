
public interface iPila<E>{
	
	public void push(E algo);
	// pre:  
	// post: se a�ade un elemento al stack
	
	public E pop();
	//pre: el stack no este vacio
	//post: retira el ultimo elemento a�adido
	
	public boolean isEmpty();
	//pre:
	//post: regresa verdadero si y solo si el stack esta vacio
	
}



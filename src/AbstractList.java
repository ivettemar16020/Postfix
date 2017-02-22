/**
 * 
 */

/**
 * @author ychav
 *
 */
public abstract class AbstractList<E> implements iList<E>
{
   private AbstractList<E> myList;
   public AbstractList()
   // post: does nothing
   {
   }

   public void push(E algo) {
		// pre:  
		// post: se agrega un elemento al stack
		myList.add(algo);	
	}

	public E pop() {
		//pre: el stack no este vacio
		//post: retira el ultimo elemento agregado
		return (E) myList.remove(myList.size()-1);
	}

	@Override
	public boolean isEmpty() {
		//pre:
		//post: regresa verdadero si y solo si el stack esta vacio
		return myList.size() == 0;
	}

}

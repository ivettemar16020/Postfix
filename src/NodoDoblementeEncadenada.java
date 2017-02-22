/**
 * 
 */

/**
 * @author ychav
 *
 */
public class NodoDoblementeEncadenada<E> {

	protected E data;
	protected NodoDoblementeEncadenada<E> nextElement;
	protected NodoDoblementeEncadenada<E> previousElement;

	public NodoDoblementeEncadenada(E v,
			NodoDoblementeEncadenada<E> next,
			NodoDoblementeEncadenada<E> previous)
	{
	    data = v;
	    nextElement = next;
	    if (nextElement != null)
	        nextElement.previousElement = this;
	    previousElement = previous;
	    if (previousElement != null)
	        previousElement.nextElement = this;
	}

	public NodoDoblementeEncadenada(E v)
	// post: constructs a single element
	{
	    this(v,null,null);
	}
}

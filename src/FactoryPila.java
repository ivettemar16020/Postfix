/**
 * 
 */

/**
 * @author IvetteCardona22
 *
 */
public class FactoryPila<E> {
	public AbstractPila<E> getPila(String tipo) {
		return getPila(tipo, "");
	}
	public AbstractPila<E> getPila(String tipo, String tipoLista) {
		if (tipo.equals("ArrayList")) {
			return new PilaArray<E>();
		}else if (tipo.equals("Vector")) {
			return new PilaVector<E>();
		}else if (tipo.equals("PilaLista")) {
			return new PilaList<E>(tipoLista);
		}else {
			return null;
		}
	}
}

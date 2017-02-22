/**
 * 
 */

/**
 * @author IvetteCardona22
 *
 */
public class FactoryList<Double> {
	public AbstractList<Double> getLista(String tipo) {
		if (tipo.equals("Circular")) {
			return new ListaCircular<Double>();
		}else if (tipo.equals("Encadenada")) {
			return new SimplementeEncadenadas<Double>();
		}else if (tipo.equals("DoblementeEncadenada")) {
			return new DoblementeEncadenada<Double>();
		}else {
			return null;
		}
	}
	
}

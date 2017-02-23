
/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * Descripcion: clase singleton 
 * Objetivo: Se encarga de garantizar que una clase solo tenga una instancia y proporcionar un punto de acceso global a ella.
 */
public class ClassicSingleton {

	private static ClassicSingleton instance = null;
	   protected ClassicSingleton() {
	      // Exists only to defeat instantiation.
	   }
	   public static ClassicSingleton getInstance() {
	      if(instance == null) {
	         instance = new ClassicSingleton();
	      }
	      else{
	            System.out.println("No se puede crear el objeto porque ya existe uno");
	        }
	      return instance;
	   }

}

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * Descripcion: interfaz de la calculadora, establece el contrato para realizarla
 * Objetivo: establecer que metodos son necesarion para la realizacion de la clase 
 */
public interface iCalculadora {

	/**
	 * @param a
	 * @param b
	 * @return la suma de a y b
	 */
	public double suma(double a, double b);
	
	
	/**
	 * @param a
	 * @param b
	 * @return la resta de a y b 
	 */
	public double resta(double a, double b);
	
	/**
	 * @param a
	 * @param b
	 * @return la multiplicacion de a por b
	 */
	public double multiplicacion(double a, double b);
	
	/**
	 * @param a
	 * @param b
	 * @return la division de a entre b
	 */
	public double division(double a, double b);
	
	/**
	 * @param cadena
	 * @return resultado
	 */
	public double operar(String n);
	
	
}

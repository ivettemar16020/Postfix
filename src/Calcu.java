import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;

/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * Descripcion: clase que implementa la interfaz Calculadora
 * Objetivo: realizar los metodos establecidos en el contrato pero devuelve los valores esperados
 */
public class Calcu implements iCalculadora {
	
	//Instanciar los objetos que se van a utilizar
	//Quitar el comentario dependiendo de si desea utilizar un arraylist o un vector
	
	//iPila<Double> miPila = new PilaArray<Double>();
	iPila<Double> miPila = new PilaVector<Double>();
	double resultado; 
	int contador;
	String operador;
	double a;
	double c;
	double d;
	int conta;
	
	/**
	 * @param a
	 * @param b
	 * @return la suma de a y b
	 */
	public double suma(double a, double b){
		return a + b;
	}
	
	
	/**
	 * @param a
	 * @param b
	 * @return la resta de a y b 
	 */
	public double resta(double a, double b){
		return a- b;
		
	}
	
	/**
	 * @param a
	 * @param b
	 * @return la multiplicacion de a por b
	 */
	public double multiplicacion(double a, double b){
		return a * b;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return la division de a entre b
	 */
	public double division(double a, double b){
		try{
			d = a/b;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"No se pudo efectuar la division");
		}
		return d;
	}
	
	/**
	 * @param n
	 * @return resultado
	 */
	public double operar(String n){
		conta = 2;
		contador = n.length();
		miPila.push(Double.parseDouble(n.substring(0,1))); //Saca el elemento segun el indice
		for (int i = 1; i <= (contador-1); i++ ){
			miPila.push(Double.parseDouble(n.substring(i,conta))); 
    		i++;
    		conta++;
    		operador = n.substring(i, conta);
    		if (operador.equals("+")){
    			c = miPila.pop();
        		a = miPila.pop();
        		resultado = suma(a,c);
        		miPila.push(resultado);
        		conta++;
        	}
    		else if (operador.equals("-")){
        		c = miPila.pop();
        		a = miPila.pop();
        		resultado = resta(a,c);
        		miPila.push(resultado);
        		conta++;
        	}
        	if (operador.equals("*")){
        		c = miPila.pop();
        		a = miPila.pop();
        		resultado = multiplicacion(a,c);
        		miPila.push(resultado);
        		conta++;
          	}
        	if (operador.equals("/")){
        		c = miPila.pop();
        		a = miPila.pop();
        		resultado = division(a,c);
        		miPila.push(resultado);
        		conta++;
        	}       
	}
		return resultado;
	}
}

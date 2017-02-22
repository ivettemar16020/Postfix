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
	
	AbstractPila<Double> miPila;
	FactoryPila factoryPila = new FactoryPila();
	double resultado; 
	int contador;
	String operador;
	double a;
	double c;
	double d;
	int conta;
	
	public void setPila(String tipoPila) {
		miPila = factoryPila.getPila(tipoPila);
	}
	
	public void setPila(String tipoPila, String tipoLista) {
		miPila = factoryPila.getPila(tipoPila, tipoLista);
	}
	
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
		contador = n.length(); //El contador sera del tamaño del string que se obtuvo del archivo
		miPila.push(Double.parseDouble(n.substring(0,1))); //Saca el elemento segun el indice
		//Se crea un for para que se realicen las operaciones hasta que la cadena se termine
		for (int i = 1; i <= (contador-1); i++ ){
			miPila.push(Double.parseDouble(n.substring(i,conta))); 
    		i++; //Se le suma 1 al contador
    		conta++; //Se le suma 1 al contador
    		operador = n.substring(i, conta);
    		if (operador.equals("+")){ //revisa el operador
    			c = miPila.pop(); //Saca el elemento de la cadena
        		a = miPila.pop(); //Saca el elemento de la cadena
        		resultado = suma(a,c); //Efectua la operacion y la guarda en resultado
        		miPila.push(resultado); //Sube el resultado a la pila
        		conta++;//Se le suma 1 al contador
        	}
    		else if (operador.equals("-")){ //revisa el operador
        		c = miPila.pop();//Saca el elemento de la cadena
        		a = miPila.pop();//Saca el elemento de la cadena
        		resultado = resta(a,c);//Efectua la operacion y la guarda en resultado
        		miPila.push(resultado);//Sube el resultado a la pila
        		conta++;//Se le suma 1 al contador
        	}
        	if (operador.equals("*")){ //revisa el operador
        		c = miPila.pop();//Saca el elemento de la cadena
        		a = miPila.pop();//Saca el elemento de la cadena
        		resultado = multiplicacion(a,c);//Efectua la operacion y la guarda en resultado
        		miPila.push(resultado);//Sube el resultado a la pila
        		conta++;//Se le suma 1 al contador
          	}
        	if (operador.equals("/")){ //revisa el operador
        		c = miPila.pop();//Saca el elemento de la cadena
        		a = miPila.pop();//Saca el elemento de la cadena
        		resultado = division(a,c);//Efectua la operacion y la guarda en resultado
        		miPila.push(resultado);//Sube el resultado a la pila
        		conta++;//Se le suma 1 al contador
        	}       
	}
		return resultado; //Devuelve el resultado 
	}
}

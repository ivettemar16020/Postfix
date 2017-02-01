import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author chavez
 *
 */
public class PostfixC  {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		iPila<Integer> miPila = new PilaArray<Integer>();
		iCalculadora miCalculadora = new Calcu();
		 String cadena;
		 int contador;
		 int a;
		 int c;
		 contador = 0;
		 	
		 	FileReader fr = new FileReader("datos.txt");
		 	BufferedReader bf = new BufferedReader(fr);
		 	System.out.println("hi");
	        while((cadena = Integer.toString(bf.read()))!=null) {
	            if (contador != 2) {
	            	miPila.push(Integer.parseInt(cadena));
	            	contador++;
	            }
	            else if (contador == 2){
	            	if (cadena.equals("+")){
	            		c = miPila.pop();
	            		a = miPila.pop();
	            		int resultado = miCalculadora.suma(a,c);
	            		miPila.push(resultado);
	            		contador = 1;
	            	}
	            	if (cadena.equals("-")){
	            		c = miPila.pop();
	            		a = miPila.pop();
	            		int resultado = miCalculadora.resta(a,c);
	            		miPila.push(resultado);
	            		contador = 1;
	            	}
	            	if (cadena.equals("*")){
	            		c = miPila.pop();
	            		a = miPila.pop();
	            		int resultado = miCalculadora.multiplicacion(a,c);
	            		miPila.push(resultado);
	            		contador = 1;
	            	}
	            	if (cadena.equals("/")){
	            		c = miPila.pop();
	            		a = miPila.pop();
	            		int resultado = miCalculadora.division(a,c);
	            		miPila.push(resultado);
	            		contador = 1;
	            	}
	            } 
	        }
	        bf.close();	 
	        int fin = miPila.pop();
	        System.out.println(fin);
	}

}

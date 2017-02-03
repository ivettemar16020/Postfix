import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * Descripcion: clase principal de la calculadora Postfix
 * Objetivo: leer un archivo .txt y analizar los datos que este contiene
 */
public class PostfixC  {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{ //FileNotFoundException, 
		
		//Instanciar objetos a utilizar
		iCalculadora miCalculadora = new Calcu();
		 String cadena;
		 	
		 //Utilizacion de buffered Reader para obtener los datos de un archivo de texto
		 	FileReader fr = new FileReader("datos.txt");
		 	BufferedReader bf = new BufferedReader(fr);
	        cadena = (bf.readLine());
	        System.out.println("El resultado es: " + miCalculadora.operar(cadena));
	        System.out.println("Gracias querido auxiliar <3");

	}
}
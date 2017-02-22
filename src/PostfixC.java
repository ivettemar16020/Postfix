import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
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
		Scanner sc = new Scanner(System.in); 
		//Instanciar objetos a utilizar
		 Calcu miCalculadora = new Calcu();
		 String cadena;
		 System.out.println("Elija el tipo de stack (ArrayList, Vector o PilaLista): ");
		 String tStack = sc.nextLine();
		 if(!tStack.equals("PilaLista")) {
			 miCalculadora.setPila(tStack);
		 }else {
			 System.out.println("Elija el tipo de lista (Circular, SimplementeEncadenada o DoblementeEncadenada): ");
			 String tLista = sc.nextLine();
			 miCalculadora.setPila(tStack, tLista);
		 }
		 
		 
		 //Utilizacion de buffered Reader para obtener los datos de un archivo de texto
		 	//FileReader fr = new FileReader("datos.txt");
		 	//BufferedReader bf = new BufferedReader(fr);
	       // cadena = (bf.readLine());
	        System.out.println("El resultado es: " + miCalculadora.operar("12+4*3+"));

	}
}
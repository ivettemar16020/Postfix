import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Yasmin Chavez 16101
 * @author Ivette Cardona 16020
 * Descripcion: clase en donde se realizaran las pruebas unitarias
 * Objetivo: realizar las pruebas correspondientes
 */
public class PruebaPostfix {
	Calcu cr = new Calcu();
	
	@Test
	public void testSuma(){
		 System.out.println("Sumando dos números");
		assertTrue(cr.suma(2,2) == 4);
	}
	
	@Test
	public void testResta(){
		 System.out.println("Restando dos números");
		assertTrue(cr.resta(2,2) == 0);
	}
	
	@Test
	public void testMultiplicacion(){
		 System.out.println("Multiplicando dos números");
		assertTrue(cr.multiplicacion(2,2) == 4);
	}
	
	@Test
	public void testDivision(){
		 System.out.println("Dividiendo dos números");
		assertTrue(cr.division(2,2) == 1);
	}
}

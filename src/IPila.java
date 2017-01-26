
public interface IPila <Y> {
	//Debido a que esta es la clase Interface solo llevara los metodos 
	
	// los metodos empleados son genericos y se pasa como argumento el tipo de
	// dato a emplear a la clase Imprimidor <T>
	
	//Metodos a utilizar
	public void push(Y item);
	//
	
	public Y pop();
	//
	
	public boolean isEmpty();
	//
}

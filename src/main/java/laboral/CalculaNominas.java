package laboral;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

public class CalculaNominas {
	
	public static void main(String[] args) throws DatosNoCorrectosException {
		
		//Instanciación de empleados
		Empleado empleado1= new Empleado("James Cosling", "32000032G", 'M', 4, 7);
		Empleado empleado2 = new Empleado("Ada Lovelace", "32000031R", 'F');
		
		//llamada a método
		escribe(empleado1, empleado2);
		
		//incremento de años del segundo empleado
		empleado2.incrAnyo();
		
		//cambio de categoría del primer empleado
		empleado1.setCategoria(9);
		
		//impirmirmos de nuevo los datos después de los cambios
		
		System.out.println("\n--------- después de los cambios ----------\n");
		escribe(empleado1, empleado2);
		
	}
		
	
	
	/**Método para impirmir los datos de los empleados
	 * 
	 * @param empleado1
	 * @param empleado2
	 */
	private static void escribe(Empleado empleado1, Empleado empleado2) {
		empleado1.imprime();
		Nomina nomina1 = new Nomina();
		
		System.out.println("el sueldo del empleado es:" + nomina1.sueldo(empleado1));
		
		empleado2.imprime();
		System.out.println("el sueldo del empleado es:" + nomina1.sueldo(empleado2));
	}
	
}

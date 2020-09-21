package laboral;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @autor Isabel Orozco
 * 
 */

public class Nomina {
	
	//Atributos
	private static final int SUELDO_BASE[] ={50000, 70000, 90000, 110000, 130000,150000, 170000, 190000, 210000, 230000};

	//Métodos
	
	/**Método que devuelve el sueldo de un empleado
	 * 
	 * @param empleado1
	 * @return
	 */
	public int sueldo(Empleado empleado1)  {
		int sueldo;
		sueldo= SUELDO_BASE[empleado1.getCategoria()-1] + (5000 * empleado1.anyosTrabajados);
		
		return sueldo;
		
	}
}

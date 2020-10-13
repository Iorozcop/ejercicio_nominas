package laboral;

import bbdd.NominasDAOImpl;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

public class CalculaNominas {
	
	public static void main(String[] args) {
		
		// PARTE 1 //
		
		//Instanciación de empleados
		Empleado empleado1;
		try {
			empleado1 = new Empleado("James Cosling", "32000032G", 'M', 4, 7);
			Empleado empleado2 = new Empleado("Ada Lovelace", "32000031R", 'F');
			
			//Creamos objeto de tipo NominasDAOImpl para poder operar con el y establecer la conexión con la BBDD
			NominasDAOImpl nomina = new NominasDAOImpl();
			
			
			
			//nomina.insertar(empleado1); // **DESCOMENTAR PARA INSERTAR EN LA BBDD LOS EMPLEADOS POR 1º VEZ** //
			//nomina.insertar(empleado2);
			
			
			
			//llamada a método
			escribe(empleado1, empleado2);
			
			//incremento de años del segundo empleado
			empleado2.incrAnyo();
			
			//cambio de categoría del primer empleado
			empleado1.setCategoria(9);
			
			//impirmirmos de nuevo los datos después de los cambios
			
			System.out.println("\n--------- después de los cambios ----------\n");
			escribe(empleado1, empleado2);
			
			//modificamos los datos en la BBDD
			nomina.update(empleado1);
			nomina.update(empleado2);
			
			//añadimos sueldo y dni a la tabla de nominas
			nomina.insertarSueldo(empleado1);
			nomina.insertarSueldo(empleado2);
			
		} catch (DatosNoCorrectosException e) {
			
			e.printStackTrace();
		}
		
		// PARTE 2 FICHEROS//
		
		// llamamos al mÉtodo escribir de la clase ficheros
		
//		try {
//			ficheros.escribe(ficheros.leer());
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		
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

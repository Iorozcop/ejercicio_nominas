package bbdd;

import laboral.Empleado;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

public interface NominasDAO {

	void insertar(Empleado empleado);
	void update(Empleado empleado);
	void insertarSueldo(Empleado empleado);

}

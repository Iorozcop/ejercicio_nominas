package laboral;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @autor Isabel Orozco
 * 
 */

public class Persona {
	
	// Atributos
	
	public String nombre;
	public String dni;
	public char sexo;
	
	// Constructores sobrecargados
	
	public Persona(String nombre, String dni, char sexo) throws DatosNoCorrectosException {
		
		this.nombre = nombre;

		if (dni.length()<9 || dni.length()>9) {
			throw new DatosNoCorrectosException("Datos no correctos");
			
		}else if(dni.codePointAt(8) < 65 || dni.codePointAt(8) > 90 ) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}else {
			this.dni= dni;
		}
		
		if(sexo == 'M' || sexo == 'F') {
			this.sexo= sexo;	
		}else {
			throw new DatosNoCorrectosException("Datos no correctos");
		}
		
	}
	
	public Persona(String nombre, char sexo) throws DatosNoCorrectosException {
		
		this.nombre = nombre;
		
		if(sexo == 'M' || sexo == 'F') {
			this.sexo= sexo;	
		}else {
			throw new DatosNoCorrectosException("Datos no correctos");
		}
		
	}


	// métodos
	
	/**
	 * Método para cambiar el dni de una persona
	 * @param dni
	 */

	public void setDni(String dni) {
		this.dni = dni;
	}

	/**Método para impirmir el nombre y el dni
	 * 
	 * @return
	 */
		
	public void imprime() {
		System.out.println("Persona [nombre=" + nombre + ", dni=" + dni + "]");
		}

	
}

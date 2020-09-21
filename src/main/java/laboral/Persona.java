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
	
	public Persona(String nombre, String dni, char sexo) {
		
		this.nombre = nombre;
		this.dni= dni;
		this.sexo= sexo;
		
	}
	
	public Persona(String nombre, char sexo) {
		
		this.nombre = nombre;
		this.sexo= sexo;
		
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

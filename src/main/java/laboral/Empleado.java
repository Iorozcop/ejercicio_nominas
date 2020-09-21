package laboral;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @autor Isabel Orozco
 * 
 */

public class Empleado extends Persona{
	
	//Atributos
	private int categoria =1;
	public int anyosTrabajados =0;
	

	//Constructores sobrecargados
	public Empleado(String nombre, String dni, char sexo, int categoria, int anyosTrabajados) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);
		
		if (categoria<=0 || categoria>10) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}else {
			this.categoria= categoria;
		}
		
		if(anyosTrabajados<0) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}else {
		this.anyosTrabajados = anyosTrabajados;
		}
	}

	public Empleado(String nombre, String dni, char sexo) {
		super(nombre, dni, sexo);
	}


	//Métodos
	
	/**Método que devuelve la categoría
	 * 
	 * @return
	 */
	public int getCategoria() {
		return categoria;
	}

	/**Método para cambiar la categoría
	 * 
	 * @param categoria
	 * @throws DatosNoCorrectosException 
	 */
	public void setCategoria(int categoria) throws DatosNoCorrectosException {
		if (categoria<=0 || categoria>10) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}else {
			this.categoria= categoria;
		}
	}
	
	/**Método para modificar los años trabajados
	 * 
	 * @param anyosTrabajados
	 * @throws DatosNoCorrectosException 
	 */
	public void setAnyosTrabajados(int anyosTrabajados) throws DatosNoCorrectosException {
		if(anyosTrabajados<0) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}else {
		this.anyosTrabajados = anyosTrabajados;
		}
	}
	
	/**Método para obtener los años trabajados de un empleado
	 * 
	 * @return
	 */
	public int getAnyosTrabajados() {
		return anyosTrabajados;
	}

	/**Método que incremente en uno los años trabajados
	 * 
	 * @param anyosTrabajados
	 * @return
	 * @throws DatosNoCorrectosException 
	 */
	public void incrAnyo(Empleado empleado1) throws DatosNoCorrectosException {	
		empleado1.setAnyosTrabajados(empleado1.getAnyosTrabajados() +1);
	}
	
	/**Método que imprime todos los datos del empleado
	 * 
	 */
	
	@Override
	public void imprime() {
		System.out.println("Empleado [categoria=" + categoria + ", anyosTrabajados=" + anyosTrabajados + ", nombre=" + nombre
				+ ", dni=" + dni + ", sexo=" + sexo + "]"); 
	}
	
}

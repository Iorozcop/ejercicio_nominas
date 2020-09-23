package ficheros;

import java.io.File;
import java.io.IOException;

public class EscribirFichero {

	private static final String path = "C:\\Users\\isa\\eclipse-workspace\\ejercicio-nominas\\ficheros";
	
	public static void main(String[] args) throws IOException {
		
		//Instanciamos un objeto de tipo File y le pasamos por parámetros la ruta
		File fichero =  new File(path);
		
		//eliminar fichero si existe
		eliminar(fichero);
				
		//Creamos el fichero
		System.out.println(crearFichero(fichero));
		

	}
	
	/**
	 * Método para crear un fichero
	 * 
	 * @param fichero Fichero a crear
	 * @return
	 * @throws IOException 
	 */

	private static boolean crearFichero(File fichero) throws IOException {
		
		return fichero.createNewFile();	
	}
	
	/**
	 * Método para eliminar un fichero (si existe)
	 * 
	 * @param textFile Fichero a eliminar
	 * @return
	 */
	private static boolean eliminar(File fichero) {
		
		return fichero.delete();
	}

}

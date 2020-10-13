package laboral;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ficheros {
	
	static String ruta= ".\\file\\empleados.txt";
	
	public static ArrayList<Empleado> leer() {
		

		//creamos array y arrayList para poder almacenar cada uno de los datos de los empleados
				String datos[]=null;
				ArrayList <Empleado> empleados = new ArrayList <Empleado>();
				
				// Fichero del que queremos leer (empleado.txt)
				File ficheroLectura = new File(ruta);
				Scanner s = null;

				try {
					s = new Scanner(ficheroLectura); // lee el contenido del fichero

					 // lee linea a linea
					while (s.hasNextLine()) {     
						String linea = s.nextLine();  // Guarda la linea en un String
						datos = linea.split("-");     // almacena cada dato de cada empleado en un array 
						
						Empleado empleado1 = new Empleado(datos[0], datos[1], datos[2].charAt(0), Integer.parseInt(datos[3]), Integer.parseInt(datos[4]));
						empleados.add(empleado1);     // almacena cada uno de los empleados en un ArrayList
						
					}

				} catch (Exception ex) {
					System.out.println("Mensaje: " + ex.getMessage());
				} finally {
					// Cerramos el fichero tanto si la lectura ha sido correcta o no
					try {
						if (s != null)
							s.close();
					} catch (Exception ex2) {
						System.out.println("Mensaje 2: " + ex2.getMessage());
					}
				}
				return empleados;
	}

				// Fichero que vamos a escribir (salario.txt)
		public static void escribe(ArrayList<Empleado> empleados) throws IOException {		
				FileWriter ficheroEscritura =  new FileWriter(".\\file\\salario.txt");
			    BufferedWriter escritura = new BufferedWriter(ficheroEscritura);
			    
				Nomina nomina1 =  new Nomina();

			    for (Empleado empleado : empleados) {
			    	
			    	escritura.write(empleado.dni + "-" + nomina1.sueldo(empleado));
			    	escritura.newLine();	    	    
		}
				 escritura.close();    
	

		}
}
					
			

	



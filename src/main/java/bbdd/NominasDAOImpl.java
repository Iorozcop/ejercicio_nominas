package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import laboral.Empleado;
import laboral.Nomina;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

public class NominasDAOImpl implements NominasDAO {
	
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/nominas";
	private static final String USUARIO = "root";
	private static final String CLAVE = "";
	
	/**
	 * Método para establecer conexión con la base de datos
	 * */
		public Connection conectar() {
			// creamos un objeto de tipo conexion
			Connection conexion = null;

			try {
				Class.forName(CONTROLADOR);
				conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
				System.out.println("------ Conexión establecida ------\n");

			} catch (ClassNotFoundException e) {
				System.out.println("Error al cargar el controlador");
				e.printStackTrace();

			} catch (SQLException e) {
				System.out.println("Error en la conexión");
				e.printStackTrace();
			}

			return conexion;
		}
		
		
		/**
		 * Método que establece conexión con la BBDD e inserta en la tabla empleados un empleado
		 * 
		 *  @param empleado
		 */
		
		public void insertar(Empleado empleado) {
			try {

				Connection conexion = conectar();
				Statement consulta = conexion.createStatement();
				String insert = String.format("INSERT INTO empleados (nombre, dni, sexo, categoria, anyosTrabajados) VALUES('%s','%s','%s','%s','%s')",
						empleado.getNombre(), empleado.getDni(), empleado.getSexo(), empleado.getCategoria(),empleado.getAnyosTrabajados());

				consulta.executeUpdate(insert);
				conexion.close();

			} catch (Exception e) {
				System.out.println(e);
			}

		}
		
		/**
		 * Método que establece conexión con la BBDD y modifica en la tabla empleados la categoría y los años trabajados del empleado
		 *
		 *  @param empleado
		 */
		
		public void update(Empleado empleado) {
			try {

				Connection conexion = conectar();
				Statement consulta = conexion.createStatement();

				consulta.executeUpdate("UPDATE empleados "
						+ "SET categoria='" + empleado.getCategoria() + "',"
						+ "anyosTrabajados='" + empleado.getAnyosTrabajados() + "'"
						+ " WHERE dni='" + empleado.getDni() + "'");

				conexion.close();
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Error al insertar");

			}
		}
		
		/**
		 * Método que establece conexión con la BBDD e inserta en la tabla nomina el sueldo y el dni del empleado
		 * 
		 *  @param empleado
		 *  
		 */
		
		public void insertarSueldo(Empleado empleado) {
			Nomina nomina= new Nomina();
			
	        try {
				
				Connection conexion = conectar();
				Statement consulta = conexion.createStatement();

				String insert = String.format("INSERT INTO nomina (sueldo, dni) VALUES('%s','%s')"
						,nomina.sueldo(empleado), empleado.getDni());
				
				consulta.executeUpdate(insert);
				conexion.close();

			} catch (Exception e) {
				System.out.println(e);
			}

		}
	
}

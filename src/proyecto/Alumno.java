package proyecto;
/**
* <h2> Clase Alumno </h2>
* Esta clase guarda los nombres de los alumnos
*
* @author Víctor y Vladimir
* @version 1.0
*
*/
public class Alumno {
	/**
	* Atributo nombre_alumno
	*
	* Indica el nombre del alumno
	*
	*/
	protected String nombre_alumno;
	
	public Alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}
	/**
	*
	* @return Devuelve el nombre del alumno
	*
	*/
	public String getNombre_alumno() {
		return nombre_alumno;
	}
	/**
	*
	* @param nombre_alumno Fijar el nombre del alumno
	*
	*/
	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}

	@Override
	public String toString() {
		return "Alumnos: " + nombre_alumno;
	}
	
}
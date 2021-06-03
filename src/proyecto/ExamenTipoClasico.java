package proyecto;
/**
* <h2> Clase ExamenesTipoClasico </h2>
* Esta clase guarda las notas de los 3 ex�menes tipo cl�sico (nota del 0 al 10) de los alumnos
*
* @author V�ctor y Vladimir
* @version 1.0
*
*/
public class ExamenTipoClasico{ 
	/**
	* Atributo nota_exclasico1
	*
	* Indica la nota del primer examen cl�sico
	*
	*/
	protected double nota_exclasico1;
	/**
	* Atributo nota_exclasico2
	*
	* Indica la nota del segundo examen cl�sico
	*
	*/
	protected double nota_exclasico2;
	/**
	* Atributo nota_exclasico3
	*
	* Indica la nota del tercer examen cl�sico
	*
	*/
	protected double nota_exclasico3;
	/**
	* Atributo notafinal_Exclasico
	*
	* Indica la nota final de los 3 ex�menes cl�sicos
	*
	*/
	 public static double notafinal_exclasico;
	
	public ExamenTipoClasico(double nota_exclasico1, double nota_exclasico2, double nota_exclasico3) {
		this.nota_exclasico1 = nota_exclasico1;
		this.nota_exclasico2 = nota_exclasico2;
		this.nota_exclasico3= nota_exclasico3;
		
	
	nota_exclasico1 = nota_exclasico1*0.1;
	nota_exclasico2 = nota_exclasico2*0.2;
	nota_exclasico3 = nota_exclasico3*0.2;
	notafinal_exclasico = nota_exclasico1+nota_exclasico2+nota_exclasico3;
	
	}
}
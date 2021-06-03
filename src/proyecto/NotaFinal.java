package proyecto; 


/**
* <h2> Clase NotaFinal </h2>
* Esta clase guarda la nota final de todos los exámenes de los alumnos
*
* @author Víctor y Vladimir
* @version 1.0
*
*/
public class NotaFinal {

	public static double nota_final=0;
		public NotaFinal(double nota_final) {
			NotaFinal.nota_final = nota_final;
		
			
			if(Trabajo.suspendido == true || Trabajo.entregado == false) {
				NotaFinal.nota_final = 3;
			}
			else {
				NotaFinal.nota_final= (((((ExamenTipoClasico.notafinal_exclasico +  ExamenTipoTest.notafinaltest) - Trabajo.decimas_penalización_por_dias_retraso)) /5))*10;
				
			}
		}

	@Override
	public String toString() {
		return "NotaFinal =" + NotaFinal.nota_final;
	}
}

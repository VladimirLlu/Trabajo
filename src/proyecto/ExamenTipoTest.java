package proyecto;
/**
* <h2> Clase ExamenesTipoTest </h2>
* Esta clase guarda las notas de los 2 exámenes tipo test de los alumnos
*
* @author Víctor y Vladimir
* @version 1.0
*
*/
public class ExamenTipoTest {
	/**
	* Atributo aciertos_extest1
	*
	* Indica los aciertos del primer examen test
	*
	*/
	protected int aciertos_extest1;
	/**
	* Atributo fallos_extest1
	*
	* Indica los fallos del primer examen test
	*
	*/
	protected int fallos_extest1;
	/**
	* Atributo aciertos_extest2
	*
	* Indica los aciertos del segundo examen test
	*
	*/
	protected int aciertos_extest2;
	/**
	* Atributo fallos_extest2
	*
	* Indica los fallos del segundo examen test
	*
	*/
	protected int fallos_extest2;
	/**
	* Atributo norespondidas_extest1
	*
	* Indica las preguntas no respondidas del primer examen test
	*
	*/
	protected int norespondidas_extest1;
	/**
	* Atributo norespondidas_extest2
	*
	* Indica las preguntas no respondidas del segundo examen test
	*
	*/
	protected int norespondidas_extest2;
	/**
	* Atributo notatest1
	*
	* Indica la nota del primer examen test
	*
	*/
	protected double notatest1;
	/**
	* Atributo notatest2
	*
	* Indica la nota del segundo examen test
	*
	*/
	protected double notatest2;
	/**
	* Atributo notafinaltest
	*
	* Indica la nota final de los exámenes test
	*
	*/
	protected static double notafinaltest;
	
	
	public ExamenTipoTest(int aciertos_extest1, int fallos_extest1, int norespondidas_extest1, int aciertos_extest2, int fallos_extest2, int norespondidas_extest2) {
		
		this.aciertos_extest1 = aciertos_extest1;
		this.fallos_extest1 = fallos_extest1;
		this.aciertos_extest2 = aciertos_extest2;
		this.fallos_extest2 = fallos_extest2;
		this.norespondidas_extest1 = norespondidas_extest1;
		this.norespondidas_extest2 = norespondidas_extest2;
}
	/**
	*
	* @return Devuelve los aciertos del primer examen test
	*
	*/
	public int getAciertos_extest1() {
		return aciertos_extest1;
	}
	/**
	*
	* @param aciertos_extest1 Fijar aciertos del primer examen test
	*
	*/
	public void setAciertos_extest1(int aciertos_extest1) {
		this.aciertos_extest1 = aciertos_extest1*3/10;
	}
	/**
	*
	* @return Devuelve los fallos del primer examen test
	*
	*/
	public int getFallos_extest1() {
		return fallos_extest1;
	}
	/**
	*
	* @param fallos_extest1 Fijar los fallos del primer examen test
	*
	*/
	public void setFallos_extest1(int fallos_extest1) {
		this.fallos_extest1 = fallos_extest1*1/10;
	}
	/**
	*
	* @return Devuelve los aciertos del segundo examen test
	*
	*/
	public int getAciertos_extest2() {
		return aciertos_extest2;
	}
	/**
	*
	* @param aciertos_extest2 Fijar los aciertos del segundo examen test
	*
	*/
	public void setAciertos_extest2(int aciertos_extest2) {
		this.aciertos_extest2 = aciertos_extest2*3/10;
	}
	/**
	*
	* @return Devuelve los fallos del segundo examen test
	*
	*/
	public int getFallos_extest2() {
		return fallos_extest2;
	}
	/**
	*
	* @param fallos_extest2 Fijar los fallos del segundo examen test
	*
	*/
	public void setFallos_extest2(int fallos_extest2) {
		this.fallos_extest2 = fallos_extest2*1/10;
	}
	/**
	*
	* @return Devuelve las preguntas no respondidas del primer examen test
	*
	*/
	public int getNorespondidas_extest1() {
		return norespondidas_extest1;
	}
	/**
	*
	* @param norespondidas_extest1 Fijar las preguntas no respondidas del primer examen test
	*
	*/
	public void setNorespondidas_extest1(int norespondidas_extest1) {
		this.norespondidas_extest1 = norespondidas_extest1;
	}
	/**
	*
	* @return Devuelve las preguntas no respondidas del segundo examen test
	*
	*/
	public int getNorespondidas_extest2() {
		return norespondidas_extest2;
	}
	/**
	*
	* @param norespondidas_extest2 Fijar las preguntas no respondidas del segundo examen test
	*
	*/
	public void setNorespondidas_extest2(int norespondidas_extest2) {
		this.norespondidas_extest2 = norespondidas_extest2;
	}
	/**
	*
	* @return Devuelve la nota del primer examen test
	*
	*/
	public double getNotatest1() {
		return notatest1;
	}
	/**
	*
	* @param notatest1 Fijar la nota del primer examen test
	*
	*/
	public void setNotatest1(double notatest1) {
		this.notatest1 = ((aciertos_extest1 - fallos_extest1)*0.25);
	}
	/**
	*
	* @return Devuelve la nota del segundo examen test
	*
	*/
	public double getNotatest2() {
		return notatest2;
	}
	/**
	*
	* @param notatest2 Fijar la nota del segundo examen test
	*
	*/
	public void setNotatest2(double notatest2) {
		this.notatest2 = ((aciertos_extest2 - fallos_extest2)*0.25);
	}
	
	public double getNotafinaltest() {
		return notafinaltest;
	}
	/**
	*
	* @param notafinaltest Fijar la nota final de los exámenes tests
	*
	*/
	public void setNotafinaltest(double notafinaltest) {
		notafinaltest = notatest1+notatest2;
	}

	@Override
	public String toString() {
		return "Examenes Test: aciertos_extest1=" + aciertos_extest1 + ", fallos_extest1=" + fallos_extest1
				+ "no respondidas examen 2:" +norespondidas_extest1+", aciertos_extest2=" + aciertos_extest2 + ", fallos_extest2=" + fallos_extest2 + "no respondidas examen 2:" +norespondidas_extest2;
	}
	
}

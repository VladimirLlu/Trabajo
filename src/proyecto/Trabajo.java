package proyecto;

public class Trabajo {

	protected int dias_retraso1;
	protected int dias_retraso2;
	protected int dias_retraso3;
	public static double decimas_penalización_por_dias_retraso;
	public static boolean suspendido;
	public static boolean entregado;
	
	public Trabajo(int dias_retraso1, int dias_retraso2, int dias_retraso3, boolean entregado) {
		
		
		this.dias_retraso1 = dias_retraso1;
		this.dias_retraso2 = dias_retraso2;
		this.dias_retraso3 = dias_retraso3;
		this.entregado=entregado;
		
			
		dias_retraso1 = dias_retraso1*1/10;
		dias_retraso2= dias_retraso2*1/10;
		dias_retraso3 = dias_retraso3*1/10;
		decimas_penalización_por_dias_retraso = dias_retraso1 + dias_retraso2 + dias_retraso3;
	
		if (dias_retraso1> 5 ||dias_retraso2>5 ||dias_retraso3 >5) {
			suspendido = true;
		}
	}
	
}
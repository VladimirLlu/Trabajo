package proyecto;


public class Tester {

	public static void main(String[] args) {
		
		
		Alumno alu[] = new Alumno[10];
		alu[0] = new Alumno ("Roberto");
		alu[1] = new Alumno ("Luisa");
		alu[2] = new Alumno ("Luis");
		alu[3] = new Alumno ("Bernarda");
		alu[4] = new Alumno ("Sebastián");
		alu[5] = new Alumno ("Carmen");
		alu[6] = new Alumno ("Eusebio");
		alu[7] = new Alumno ("Paquita");
		alu[8] = new Alumno ("Wenceslao");
		alu[9] = new Alumno ("Regismundo");
		
		for (Alumno alumnado: alu) {
            System.out.println(alumnado.toString());
            System.out.println("");
		
		ExamenTipoClasico examclasic[] = new ExamenTipoClasico[10];
		examclasic[0] = new ExamenTipoClasico (7, 6.85, 9.3);
		examclasic[1] = new ExamenTipoClasico (5, 4.22, 7);
		examclasic[2] = new ExamenTipoClasico (7.10, 5.86, 3.8);
		examclasic[3] = new ExamenTipoClasico (5.15, 4.92, 1);
		examclasic[4] = new ExamenTipoClasico (4.55, 4.15, 4.98);
		examclasic[5] = new ExamenTipoClasico (10, 9.25, 9.64);
		examclasic[6] = new ExamenTipoClasico (2.3, 0.85, 3.3);
		examclasic[7] = new ExamenTipoClasico (8.82, 7.85, 5.3);
		examclasic[8] = new ExamenTipoClasico (4, 3.85, 6.3);
		examclasic[9] = new ExamenTipoClasico (3.35, 5.85, 7.3);
		
		ExamenTipoTest examtest[] = new ExamenTipoTest[10];
		examtest[0] = new ExamenTipoTest (20, 4, 6, 15, 8, 7);
		examtest[1] = new ExamenTipoTest (15, 8, 7, 11, 7, 12);
		examtest[2] = new ExamenTipoTest (20, 2, 8, 25, 5, 0);
		examtest[3] = new ExamenTipoTest (10, 6, 14, 0, 1, 29);
		examtest[4] = new ExamenTipoTest (22, 7, 1, 19, 0, 11);
		examtest[5] = new ExamenTipoTest (30, 0, 0, 26, 2, 2);
		examtest[6] = new ExamenTipoTest (15, 3, 12, 19, 5, 6);
		examtest[7] = new ExamenTipoTest (22, 7, 1, 20, 1, 9);
		examtest[8] = new ExamenTipoTest (28, 2, 0, 21, 5, 4);
		examtest[9] = new ExamenTipoTest (12, 0, 18, 19, 1, 10);
		
		Trabajo trbj[] = new Trabajo[10];
		trbj[0] = new Trabajo (3, 1, 0, true);
		trbj[1] = new Trabajo (5, 2, 1, true);
		trbj[2] = new Trabajo (7, 3, 1, true);
		trbj[3] = new Trabajo (0, 1, 0, true);
		trbj[4] = new Trabajo (1, 1, 1, true);
		trbj[5] = new Trabajo (4, 0, 6, true);
		trbj[6] = new Trabajo (9, 2, 2, true);
		trbj[7] = new Trabajo (0, 0, 0, true);
		trbj[8] = new Trabajo (3, 3, 3, true);
		trbj[9] = new Trabajo (5, 5, 1, true);
		
		}
		
		NotaFinal FinalNote[] = new NotaFinal[10];
		FinalNote[0] = new NotaFinal (NotaFinal.nota_final);
		FinalNote[1] = new NotaFinal (NotaFinal.nota_final);
		FinalNote[2] = new NotaFinal (NotaFinal.nota_final);
		FinalNote[3] = new NotaFinal (NotaFinal.nota_final);
		FinalNote[4] = new NotaFinal (NotaFinal.nota_final);
		FinalNote[5] = new NotaFinal (NotaFinal.nota_final);
		FinalNote[6] = new NotaFinal (NotaFinal.nota_final);
		FinalNote[7] = new NotaFinal (NotaFinal.nota_final);
		FinalNote[8] = new NotaFinal (NotaFinal.nota_final);
		FinalNote[9] = new NotaFinal (NotaFinal.nota_final);
		
		
		for (NotaFinal Ntf: FinalNote) {
            System.out.println(Ntf.toString());
            System.out.println(" ");
		
          //esto es todo
}

		}
	}
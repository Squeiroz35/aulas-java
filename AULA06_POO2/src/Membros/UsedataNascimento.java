package Membros;

public class UsedataNascimento {
		public static void main(String[] args) {
			DataNacismento dt = new DataNacismento();
			DataNacismento dt2 = new DataNacismento();
			
			
			dt.dia=25;
			dt.mes=01;
			dt.ano=1992;
			
			dt2.dia=25;
			dt2.mes=01;
			dt2.ano=1992;
			System.out.printf("a data de nascimento" + "é %d %d %d \n",dt.dia,dt.mes,dt.ano);
			System.out.printf("a data de nascimento" + "é %d %d %d \n",dt2.dia,dt2.mes,dt2.ano);
		}
}

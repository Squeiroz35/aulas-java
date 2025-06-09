package AULA02;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int num= Entrada.nextInt();
		
		if(num==1) {
			System.out.println("Domingo");
		}
		else if(num==2) {
			System.out.println("Segunda");
		}
		else if(num==3) {
			System.out.println("Terça");
		}
		else if(num==4) {
			System.out.println("Quarta");
		}
		else if(num==5) {
			System.out.println("Quinta");
		}
		else if(num==6) {
			System.out.println("Sexta");
		}
		else if(num==7) {
			System.out.println("Sabado");
			
		String resultado= (num==1? "Domingo" : num==2? "Segunda" : num==3? "terça" : num==4? "quarta" : num==5? "Quinta" : num==6? "Sexta" :num==7? "Sabado": "Invalido");
		System.out.println(resultado);
		
		
		switch(num) {
		case 1:
			System.out.println("Domingo");
			
		case 2:
			System.out.println("Segunda");
			
		case 3:
			System.out.println("Terça");
			
		case 4:
			System.out.println("Quarta");
			
		case 5:
			System.out.println("Quinta");
			
		case 6:
			System.out.println("Sexta");
			
		case 7:
			System.out.println("Sabado");
		}
	
		}
		Entrada.close();
	}
}

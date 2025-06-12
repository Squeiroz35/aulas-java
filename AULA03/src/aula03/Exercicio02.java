package aula03;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner Entrada= new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos:");
		int  alunos= Entrada.nextInt();
		double soma= 0;
		int contador= 0;
		
		while (contador < alunos) {
			System.out.println("digite uma nota:");
			double notas =Entrada.nextDouble();
			contador++;
			soma = soma + notas;
			
		}
		double media = soma/ alunos;
		
		System.out.printf("a media dos alunos é : %2f", media);
		
		
		Entrada.close();
	}

}

package aula04;

import java.util.Scanner;

public class Exercicio01 {
	
 	public static void main(String[] args) {
 		Scanner Input = new Scanner(System.in);
 		double soma_notas = 0;
 		double array_notas[] = new double[5];
 		
 		for (int i = 0; i < array_notas.length; i++) {
 			System.out.println("Digite uma nota:");
 			 array_notas[i] = Input.nextDouble();
 	}
 		for (double x : array_notas) {
 				soma_notas += x;
 		}
 		
 		double media = soma_notas /5;
 		System.out.printf(" media da turma é: %.2f", media);
 	
 		Input.close();
}
}

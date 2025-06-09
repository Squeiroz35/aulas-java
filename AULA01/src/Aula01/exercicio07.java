package Aula01;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		System.out.print("Digite um numero:");
		double resp = Entrada.nextDouble();
		/*
		 * if (resp>0) { System.out.print("Positivo"); }else {
		 * System.out.print("Negativo"); }
		 */
		System.out.println(resp== 0 ? "Zero": resp> 0? "Positivo" : "Negativo");
	
	}

}

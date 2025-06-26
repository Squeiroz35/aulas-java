package aula04;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
Scanner Input = new Scanner(System.in);
		
		System.out.println("Digite um texto:");
		String texto = Input.nextLine();
		
		String resultado = texto.toUpperCase();
		System.out.println(resultado);
		
		Input.close();

	}

}

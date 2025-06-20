package aula04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int contador = 0;
		Scanner Input = new Scanner(System.in);
		
        System.out.println("Digite uma frase:");

        String texto = Input.nextLine();

        String[] palavras = texto.split("\\s+");

        if (palavras.length > 0 && !palavras[0].isEmpty()) {
            contador = palavras.length;
   }
        System.out.printf("Quantidade de palavras: %d", contador);

        Input.close();
	}

}

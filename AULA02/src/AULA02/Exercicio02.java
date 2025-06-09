package AULA02;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero:");
		int resp1 = Entrada.nextInt();
		
		System.out.print("Digite o segundo numero:");
		int resp2 = Entrada.nextInt();
		
		System.out.print("Digite o terceiro numero:");
		int resp3 = Entrada.nextInt();
		/*
		if (resp1>resp2 && resp1>resp3) {System.out.println("resp1 maior que resp2 e resp3");
	}
		if (resp2>resp1 && resp2>resp3) {System.out.println("resp2 maior que resp1 e resp3");
	}
		else
			{System.out.println("resp3 maior que resp1 e resp2");*/
			
		/*
		 * System.out.println(resp1>resp2 && resp1>resp2?
		 * "resp1 maior que resp2 e resp3": resp2>resp1 && resp2>resp3?
		 * "resp2 maior que resp1 e resp3": "resp3 maior que resp1 e resp2" );
		 */
		
		int maiorValor = Math.max(Math.max(resp1, resp2),resp3);
		System.out.printf("o maior numero é: %d", maiorValor);
		
		Entrada.close();
		
		}
	}

		

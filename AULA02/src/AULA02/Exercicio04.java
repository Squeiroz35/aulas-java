package AULA02;
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Digite primeira nota:");
		double nota1= Entrada.nextInt();
		
		System.out.println("Digite segunda nota:");
		double nota2= Entrada.nextInt();
		
		double media= (nota1+nota2)/2;
		System.out.println(media);
		
		Entrada.close();
		
	}

}

package AULA02;
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		int contador=0;
		Scanner Entrada= new Scanner(System.in);
		System.out.println("Telefonou para a vitima?");
		char resp1= Entrada.next().charAt(0);
		
		if(resp1 == 'S'||resp1== 's') {
			contador++;
		}
		
		System.out.println("Esteve no local do crime?");
		char resp2= Entrada.next().charAt(0);
		
		if (resp2 == 'S'||resp2 == 's') {
			contador++;
		}
		
		System.out.println("Mora perto da vitima?");
		char resp3= Entrada.next().charAt(0);
		
		if (resp3 == 'S'||resp3 == 's') {
			contador++;
		}
		
		System.out.println("Devia para a vitima?");
		char resp4= Entrada.next().charAt(0);
		
		if (resp4 == 'S'||resp4 == 's') {
			contador++;
		}
		
		System.out.println("Já trabalhou com a vitima?");
		char resp5= Entrada.next().charAt(0);
		
		if (resp5 == 'S'||resp5 == 's') {
			contador++;
		}
		System.out.println(contador);
		
		if (contador == 2) {
			System.out.println("Suspeito");
		}
		else if (contador == 3 || contador == 4) {
			System.out.println("Cumplice");
		}
		else if (contador == 5) {
			System.out.println("Assassino");
		}
		else {
			System.out.println("Inocente");
		}
		Entrada.close();
	}

}

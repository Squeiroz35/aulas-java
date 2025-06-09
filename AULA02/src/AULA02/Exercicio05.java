package AULA02;
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner Entrada= new Scanner(System.in);
		System.out.println("Digite uma letra:");
		char letra= Entrada.next().charAt(0);
		
		String resultado = (letra== 'F'|| letra== 'f'? "Feminino": letra== 'M'|| letra== 'm'? "Masculino": "Invalido");
		System.out.println(resultado);
		
		if(letra=='F'|| letra=='f') {
			System.out.println("Feminino");
		}
		else if(letra=='M'|| letra=='m') {
			System.out.println("Masculino");
		}
		else {
			System.out.println("Invalido");
			
		Entrada.close();
		}

	}

}

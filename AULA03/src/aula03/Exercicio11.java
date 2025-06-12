package aula03;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner Input= new Scanner(System.in);
		double array1[] = new double[4];
		double array2[] = new double[4];
		double array3[] = new double[4];
		double array4[] = new double[4];
		
		for (int i = 0;i<4; i++ ) {
			System.out.println("digite 4 numero para o array1:");	
			array1[i] = Input.nextInt();
			System.out.println("digite 4 numero para o array2:");	
			array2[i] = Input.nextInt();
			System.out.println("digite 4 numero para o array3:");	
			array3[i] = Input.nextInt();
			System.out.println("digite 4 numero para o array4:");	
			array4[i] = Input.nextInt();
		}
}
}
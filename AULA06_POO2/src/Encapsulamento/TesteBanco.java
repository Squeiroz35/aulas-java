package Encapsulamento;

public class TesteBanco {

	public static void main(String[] args) {
		ContaBancaria s1 = new ContaBancaria();
		
		s1.depositar(10);
		System.out.print(s1.getSaldo());
		s1.sacar(5);
		

	}

}

package Encapsulamento;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa s1 = new Pessoa();
		
		s1.setNome("Sérgio");
		s1.setIdade(19);
		
		System.out.println(s1.getNome());
		System.out.println(s1.getIdade());

	}

}

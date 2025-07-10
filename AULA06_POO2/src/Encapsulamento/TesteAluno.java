package Encapsulamento;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno s1 = new Aluno();
		
		s1.setNome("sérgio");
		s1.setNota1(9);
		s1.setNota2(5);
		System.out.println(s1.isAprovado());
	}

}

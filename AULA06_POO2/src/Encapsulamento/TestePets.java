package Encapsulamento;

public class TestePets {

	public static void main(String[] args) {
		Pet s1 = new Pet();
		
		s1.setNome("jubilei safado");
		s1.setIdade(69);
		s1.setTipo("safado");
		s1.setRaca("safadão");
		
		System.out.println(s1.getNome());
		System.out.println(s1.getIdade());
		System.out.println(s1.getTipo());
		System.out.println(s1.getRaca());
		
		
		
	}

}

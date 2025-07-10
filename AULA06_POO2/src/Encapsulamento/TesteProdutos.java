package Encapsulamento;

public class TesteProdutos {

	public static void main(String[] args) {
		Produto s1 = new Produto();
		
		s1.adicionarEstoque(10);
		System.out.println(s1.getQuantidadeEstoque());
		s1.removerEstoque(5);
		System.out.println(s1.getQuantidadeEstoque());
		
	}

}

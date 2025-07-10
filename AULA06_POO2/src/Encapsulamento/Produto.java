package Encapsulamento;

public class Produto {
		private String nome;
		private double preco;
		private int  quantEstoque;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public int getQuantidadeEstoque() {
			return quantEstoque;
		}
		public void adicionarEstoque(int qnt) {
			this.quantEstoque += qnt;
		}
		public void removerEstoque(int qnt) {
			this.quantEstoque -= qnt;
		}
		
}
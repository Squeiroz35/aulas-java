package metodos;

public class carro {
	String modelo;
	String cor;
	String preco;
	
	public carro() {
		
	}
	public carro(String modelo) {
		this.modelo = modelo;
	}
	public carro(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	public carro(String modelo, String cor, String preco) {
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
	}
}

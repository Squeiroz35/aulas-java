package JavaPOO;

public class Pessoa {
		String nome;
		int idade;
		double altura;
		String genero;
		String comida;
		
		public void comer(String comida) {
			
			System.out.printf("%s começou a comer %s", nome, comida);
		}
		
		public void exibirAtributos() {
			System.out.printf("%s\n %d\n %.2f\n %s\n %s", nome, idade, altura, genero, comida);
		}
}

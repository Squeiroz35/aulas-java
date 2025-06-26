package JavaPOO;

public class testePessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();

		p1.nome= "sergio";
		p1.idade= 19;
		p1.altura= 1.85;
		p1.genero= "Masculino";
		p1.comida= "parmegiana";
		
		p1.comer("yakisoba");
		
		p1.exibirAtributos();
	}

}

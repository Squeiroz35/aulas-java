package metodos;

public class calculadora {

	public static void main(String[] args) {
		calculametodos conta = new calculametodos();
		int valor;
	    valor = conta.somar(15, 50);
	    System.out.printf("valor da soma é:%d \n", valor);
		valor = conta.somar2(15, 50,30);
		System.out.printf("valor da soma é:%d \n", valor);
		
		
		valor = conta.subtrair(15,50);
		System.out.printf("o valor da subtração é:%d \n", valor);
		valor = conta.subtrair2(15,50,30);
		System.out.printf("valor da subtração é:%d \n", valor);
		
		valor = conta.multi(15,50);
		System.out.printf("o valor da multiplicação é:%d \n",valor);
		valor = conta.multi2(15,50,30);
		System.out.printf("o valor da multiplicação é:%d \n",valor);
		
		valor = conta.divisao(15,50);
		System.out.printf("o valor da divisao é:%d \n",valor);
		valor = conta.divisao2(15,50,30);
		System.out.printf("o valor da divisao é:%d \n",valor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

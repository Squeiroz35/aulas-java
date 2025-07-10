package Encapsulamento;

public class ContaBancaria {
	private String numeroConta;
	private double saldo;
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void depositar(double valor) {
		if (valor <= 0){
			System.out.printf("tente inserir um valor valido!!\n");
		}else {
			System.out.printf("O deposito de %.2f feito com sucesso!! \n",valor);
			this.saldo += valor;
		}
	}
	public void sacar(double valor) {
		
		if (this.saldo < valor) {
			System.out.println("não a saldo sufiente para sacar!!");
		}else {
			this.saldo -=valor;
			System.out.printf("\nseu saldo atual é de %.2f\n", valor);
		}
	}
	
	}
	


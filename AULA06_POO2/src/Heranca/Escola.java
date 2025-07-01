package Heranca;

public class Escola {
	public static void main(String[] args) {
		Aluno c1 = new Aluno("sérgio", "102993847561", "81988028595");
		Professor c2 = new Professor("WELLINGTHON", "02938475160", "81988277766");
		c2.salario = 3000;
		Funcionario c3 = new Funcionario("daniel", "56473823910", "81982858822");
		c3.salario = 5000;
	}
}

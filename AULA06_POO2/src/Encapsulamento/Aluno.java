package Encapsulamento;

public class Aluno {
	private String nome;
	private double nota1,nota2;
	private double media;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getMedia() {
	double	media = (nota1+nota2)/2;
	return media;
	}
	public boolean isAprovado() {
		if(media <=6.0) {
			return true;
		}else {
			return false;		}
	}
}

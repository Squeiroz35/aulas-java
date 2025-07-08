package Encapsulamento;

public class Retangulo {
 private double base;
 private double altura;
 public Retangulo(double b,double a) {
	 this.base=b;
	 this.altura=a;
	 

}public double resultadoArea() {
	return this.base*this.altura;
	
}
public double resultadoPerimetro() {
	return (altura + this.base)* 2;
}
}
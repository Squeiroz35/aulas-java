package javaPoo2;

public class Cavalo {
		String nome= "Adran Papilonms";
public Cavalo() {
}

public Cavalo(String nome){
	this.nome=nome;
}

public void comer() {
		System.out.println("comendo");
}

final void comer(String comida) {
		System.out.printf("foi comer %s",comida);
}
	
}

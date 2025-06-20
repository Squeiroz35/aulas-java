package aula04;
import java.util.Arrays;
import java.util.List;
public class Exercicio08 {
	
	public static void main(String[] args) {
		String vida_array[] = {"a", "vida", "é", "bela"};
		

        List<String> lista = Arrays.asList(vida_array);

        
        String[] novaOrdem = {
            lista.get(lista.indexOf("bela")),
            lista.get(lista.indexOf("é")),
            lista.get(lista.indexOf("a")),
            lista.get(lista.indexOf("vida"))
        };

       
        for (int i = 0; i < vida_array.length; i++) {
            vida_array[i] = novaOrdem[i];
        }

        
        for (String palavra : vida_array) {
            System.out.print(palavra + " ");
        }
		
		
	}
}

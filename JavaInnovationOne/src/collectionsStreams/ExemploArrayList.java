package collectionsStreams;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("carlos");
		nomes.add("Maria");
		nomes.add("Pedro");
		nomes.add("Tiago");
		nomes.add("João");
		
		System.out.println(nomes);
		
		//Collections.sort(nomes);  para inverter ordem.
		
		
		//nomes.set(2, "Larissa"); // set , troca nome , pedro para larissa.
		
		//nomes.remove(0); remove o index, posição da lista
		//nomes.remove("Tiago"); remove o nome.
		
		// String nome = nomes.get(1); retorna o elemento index 1
		
		System.out.println(nomes.size()); //retorna o tamanho da lista
		
		System.out.println(nomes.contains("Pedro")); //true retorna se tem ou não Pedro.
		
		System.out.println(nomes.contains("pedro")); //false 
		
		//navegação
		for(String item: nomes ) {
			System.out.println(item);
		}
		
		
	}
}
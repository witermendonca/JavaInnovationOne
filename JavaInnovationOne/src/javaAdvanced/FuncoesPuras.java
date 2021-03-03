package javaAdvanced;

import java.util.function.BiPredicate;

public class FuncoesPuras {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> verificarSeEMaior =
				(parametro, valorComparacao) -> parametro > valorComparacao;
				
		
				System.out.println(verificarSeEMaior.test(13, 12)); //true
				System.out.println(verificarSeEMaior.test(13, 12)); //true
				System.out.println(verificarSeEMaior.test(12, 12)); //false
	}

}

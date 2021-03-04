package javaAdvanced2;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<String, String> nomeContrario = texto -> new StringBuilder(texto).reverse().toString();
		
		Function<String, Integer> converteStringParaIntECalDobro = string -> Integer.valueOf(string) * 2;
		
		System.out.println(nomeContrario.apply("Witer"));
		
		System.out.println(converteStringParaIntECalDobro.apply("20"));
	}

}

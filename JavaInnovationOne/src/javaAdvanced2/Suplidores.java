package javaAdvanced2;

import java.util.function.Supplier;

public class Suplidores {
	public static void main(String[] args) {
		
		//Supplier não recebe parametro 
		Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
		Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
		System.out.println(instanciaPessoa.get());
		System.out.println(instanciaPessoa2.get());
	}
}

class Pessoa {
	private String nome;
	private Integer idade;

	public Pessoa() {
		nome = "Witer";
		idade = 30;
	}

	@Override
	public String toString() {
		return String.format("nome: "+  nome  + " , idade: " + idade + " anos.");
	}
}
package javaAdvanced2;

import java.util.function.Predicate;

public class Predicados {

	public static void main(String[] args) {
		
	    Predicate<String> estaVazio = String::isEmpty;
	    
        System.out.println(estaVazio.test("")); //True , vazio
        System.out.println(estaVazio.test("Joao")); //False

	}

}

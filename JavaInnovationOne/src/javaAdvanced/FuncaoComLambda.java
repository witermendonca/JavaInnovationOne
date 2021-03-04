package javaAdvanced;

public class FuncaoComLambda {

	public static void main(String[] args) {

		// Lambda no Java sem uso de chave com apenas uma instrução.
		// InterfaceFuncional + nomeVariavel = parametro -> logica
		Funcao colocarSrNaString = valor -> "Sr. " + valor;
		System.out.println(colocarSrNaString.gerar("Witer"));
		

		// Lambda no Java com uso de chave com mais de uma instrução.
		// InterfaceFuncional + nomeVariavel = parametro -> logica
		Funcao colocarPrefixoSrNaString = valor -> {
			String comSr = "Sr. " + valor;
			String comPontoFinal = comSr + ".";
			return comPontoFinal;
		};
		System.out.println(colocarPrefixoSrNaString.gerar("Witer"));
	}

}

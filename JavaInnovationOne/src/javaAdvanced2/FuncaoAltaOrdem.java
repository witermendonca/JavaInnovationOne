package javaAdvanced2;

public class FuncaoAltaOrdem {

	public static void main(String[] args) {
		Calculo soma = (a, b) -> a+b;
		Calculo subtracao = (a,b) -> a-b;
		Calculo multiplicacao = (a,b) -> a*b;
		Calculo divisao = (a,b) -> a/b;
		
		System.out.println("A Soma de a + b = " + executar(soma, 55, 45));
		System.out.println("A Subtra��o de a + b = " + executar(subtracao, 55, 45));
		System.out.println("A Multiplica��o de a + b = " + executar(multiplicacao, 55, 5));
		System.out.println("A Divis�o de a + b = " + executar(divisao, 55, 5));
		
		
	}

	public static int executar(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}
}

@FunctionalInterface
interface Calculo {
	public int calcular(int a, int b);
}

//Por parametro ela recebe outra fun��o ou retorna uma fun��o 
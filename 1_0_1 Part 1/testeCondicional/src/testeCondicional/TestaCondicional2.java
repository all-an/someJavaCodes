package testeCondicional;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicional");

		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("O valor de acompanhado � = " + acompanhado);
	
		//if (idade >= 18 || ) {
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo.");
		} else {
			System.out.println("Infelizmente n�o pode entrar");
			System.out.println("Sua idade � = " + idade);
			System.out.println("N�mero de pessoas = " + quantidadePessoas);
		}

	}
}

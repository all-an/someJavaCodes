package testeCondicional;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicional");

		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = true;
		
		System.out.println("Número de pessoas = " + quantidadePessoas);

		//if (idade >= 18 || quantidadePessoas >= 2) {
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo.");
		} else {
			System.out.println("Infelizmente não é maior de idade.");
		}

	}
}

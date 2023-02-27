
public class TestaCondicional2 {
	
public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		System.out.println("só entre se tiver 18 anos e se estiver acompanhado(a)");
		
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
//		aqui faço uso do operador e = "&&", mas existe também o ou = "||"
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo(a)");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
		
		System.out.println("adeus!");
		
	}

}

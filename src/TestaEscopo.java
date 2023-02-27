
public class TestaEscopo {
	
	public static void main(String[] args) {
		
		// aqui no main as variáveis são locais ou temporárias
		
		System.out.println("testando condicionais");
		System.out.println("só entre se tiver 18 anos e se estiver acompanhado(a)");
		
		int idade = 18;
		int quantidadePessoas = 3;
		
		// boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo(a)");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
		
		System.out.println("adeus!");
		
	}

}

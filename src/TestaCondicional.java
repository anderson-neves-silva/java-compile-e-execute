
public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		System.out.println("só entre se tiver 18 anos ou mais, ou se estiver acompanhado(a)");
		
		int idade = 19;
		int quantidadePessoas = 2;
		
		if (idade >= 18) {
			System.out.println("você tem " + idade + " anos, pode entrar");
			System.out.println("seja bem vindo(a)");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("você não pode entrar, sua idade é " + idade + " anos, mas como está acompanhado(a) pode entrar");
				System.out.println("seja bem vindo(a)");
			} else {
				System.out.println("você tem apenas " + idade + " anos e não está acompanhado(a), infelizmente não pode entrar");
			}
			
		}
		
		System.out.println("adeus!");
		
	}

}

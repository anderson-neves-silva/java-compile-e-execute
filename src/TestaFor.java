
public class TestaFor {
	
	public static void main(String[] args) {
		for (int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		// aqui não exibe a variável contador por questão dr escopo, pois a varivel só existe dentro das chaves do for
		// System.out.println(contador);
	}

}

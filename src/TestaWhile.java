
public class TestaWhile {
	
	public static void main(String[] args) {
		int contador = 0;		
		while (contador <= 10) {
			System.out.println(contador);
			//contador = contador + 1;
			//contador += 1;
			contador++;
		}
		// aqui contador vale 11 pois foi o último que parou
		System.out.println(contador);
		
	}

}

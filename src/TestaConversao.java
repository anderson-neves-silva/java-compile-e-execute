
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
//		convertendo valor double em int, conhecido como casting
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 32432423523L;
		short valorPequeno = 2131;
		byte valorBemMenor = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}

}

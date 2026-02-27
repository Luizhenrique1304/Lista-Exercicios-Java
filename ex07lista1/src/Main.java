import java.util.Scanner;

class Cilindro {
	double raio;
	double altura;
	
	double volume() {
		return 3.14 * raio * raio * altura;
	}
}

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cilindro c = new Cilindro();
		
		System.out.println("Digite o valor do raio: ");
		c.raio = Double.parseDouble(sc.nextLine());
		
		System.out.println("Digite o valor da altura: ");
		c.altura = Double.parseDouble(sc.nextLine());
		
		double volumeFinal = c.volume();
		
		System.out.println("O valor do volume é " + volumeFinal);
		
		sc.close();
	}
}
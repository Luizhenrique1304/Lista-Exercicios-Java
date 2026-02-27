import java.util.Scanner;

class Triangulo {
	double lado1;
	double lado2;
	double lado3;
	
	double perimetro() {
		return lado1 + lado2 + lado3;
	}
}

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo t = new Triangulo();
		
		System.out.println("Digite o lado 1: ");
		t.lado1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Digite o lado 2: ");
		t.lado2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Digite o lado 3: ");
		t.lado3 = Double.parseDouble(sc.nextLine());
		
		double perimetro = t.perimetro();
		
		System.out.println("O Perimetro é: " + perimetro);
		
		sc.close();
	}
}
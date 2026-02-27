import java.util.Scanner;

class Temperatura {
	double valorCelsius;
	
	double converterParaFahrenheit() {
		return (valorCelsius * 9/5) + 32;
	}
}

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Temperatura t = new Temperatura();
		
		System.out.println("Digite a temperatura em celsius: ");
		t.valorCelsius = Double.parseDouble(sc.nextLine());
		
		double conversao = t.converterParaFahrenheit();
		
		System.out.println("A Temperatura em Fahrenheit é " + conversao);
		
		sc.close();
	}
}
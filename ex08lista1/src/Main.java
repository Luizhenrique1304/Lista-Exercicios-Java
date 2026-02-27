import java.util.Scanner;

class ContaBancaria {
	String nomeTitular;
	double saldo;
	
	void depositar(double valor) {
		saldo += valor;
	}
	
	void exibirSaldo() {
		System.out.println("Saldo Final: " + saldo);
	}
}

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria();
		
		System.out.println("Nome do titular: ");
		conta.nomeTitular = sc.nextLine();
		
		System.out.println("Saldo Inicial: ");
		conta.saldo = Double.parseDouble(sc.nextLine());
		
		System.out.println("Valor do depósito: ");
		double valorDeposito = Double.parseDouble(sc.nextLine());
		
		conta.depositar(valorDeposito);
		conta.exibirSaldo();
		
		sc.close();
	}
}
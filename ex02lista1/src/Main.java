import java.util.Scanner;

class Funcionario {
	String nome;
	double salarioBruto;
	double desconto;
	
	double salarioLiquido() {
		return salarioBruto - desconto;
	}
}

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario f = new Funcionario();
		
		System.out.println("Digite o nome do funcionário: ");
		f.nome = sc.nextLine();
				
		System.out.println("Digite o salário bruto: ");
		f.salarioBruto = Double.parseDouble(sc.nextLine());
		
		System.out.println("Digite o desconto: ");
		f.desconto = Double.parseDouble(sc.nextLine());
		
		double salario = f.salarioLiquido();
		
		System.out.println("Salário Liquido: " + salario);
		
		sc.close();
	}
}
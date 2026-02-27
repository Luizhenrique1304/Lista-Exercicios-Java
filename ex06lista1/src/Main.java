import java.util.Scanner;

class Aluno {
	String nome;
	double nota1;
	double nota2;
	
	double media() {
		return (nota1 + nota2) / 2;
	}
}

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno a = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		a.nome = sc.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		a.nota1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Digite a segunda nota: ");
		a.nota2 = Double.parseDouble(sc.nextLine());
		
		double notaFinal = a.media();
		
		System.out.println("A média do(a) aluno " + a.nome + " é " + notaFinal);
		
		sc.close();
	}
}
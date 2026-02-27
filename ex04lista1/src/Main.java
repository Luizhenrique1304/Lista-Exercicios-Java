import java.util.Scanner;

class Produto {
	String produto;
	double preco;
	int quantidade;
	
	double total() {
		return preco * quantidade;
	}
}

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produto p = new Produto();
		
		System.out.println("Digite o nome do Produto: ");
		p.produto = sc.nextLine();
		
		System.out.println("Digite o preço do Produto: ");
		p.preco = Double.parseDouble(sc.nextLine());
		
		System.out.println("Digite a quantidade do Produto: ");
		p.quantidade = sc.nextInt();
		
		double valorTotal = p.total();
		
		System.out.println("O valor total é " + valorTotal);
		
		sc.close();
	}
}
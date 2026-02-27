import java.util.Scanner;

class Retangulo {
    double altura;
    double largura;

    double calcularArea() {
        return altura * largura;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangulo r = new Retangulo();

        System.out.print("Digite a altura: ");
        r.altura = Double.parseDouble(sc.nextLine());

        System.out.print("Digite a largura: ");
        r.largura = Double.parseDouble(sc.nextLine());

        double area = r.calcularArea();

        System.out.println("Área do Retângulo: " + area);

        sc.close();
    }
}
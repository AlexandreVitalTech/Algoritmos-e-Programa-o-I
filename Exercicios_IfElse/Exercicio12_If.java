import java.util.Scanner;

public class Exercicio12_If {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario, desconto = 0;

        System.out.println("Digite o salário: ");
        salario = ler.nextInt();

        if (salario <= 600.00){
            System.out.println("Desconto não se aplica.");
        } else if (salario <= 1200.00){
            desconto = salario * 0.20;
        } else if (salario <= 2000.00){
            desconto = salario * 0.25;
        } else {
            desconto = salario * 0.30;
        }

        System.out.printf("O desconto do INSS é de R$ %.2f%n", desconto);
        ler.close();
    }
}

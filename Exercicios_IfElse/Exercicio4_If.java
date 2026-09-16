
import java.util.Scanner;

public class Exercicio4_If {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = ler.nextInt();

        if (num1 > num2){
            System.out.println("Ordem decrescente: "+ num1 + ", depois "+ num2);
        } else {
            System.out.println("Ordem decrescente: "+ num2 + ", depois "+ num1);
        }
        ler.close();
    }
}

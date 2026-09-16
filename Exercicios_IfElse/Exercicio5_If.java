
import java.util.Scanner;

public class Exercicio5_If {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Digite o número inteiro: ");
        num = ler.nextInt();

        if (num >= 50 && num <= 100){
            System.out.println("É adequado ao intervalo.");
        } else {
            System.out.println("Não é adequado ao intervalo.");
        }
        ler.close();
    }
}

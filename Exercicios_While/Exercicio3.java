//Alexandre Vital de Oliveira Arcanjo
package Exercicios_While;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int atual = 1;

        System.out.println("Digite um número");
        int num = ler.nextInt();

        while (atual <= num) {
            System.out.println(atual);
            atual = atual * 2;
        }

        ler.close();
    }
}

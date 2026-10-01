//Alexandre Vital de Oliveira Arcanjo
package Exercicios_While;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        int i = 1;

        while (i <= 10) {
            System.out.println("Digite um número");
            int num = ler.nextInt();

            if (num <= menor) {
                menor = num;
            }

            i++;
        }

        System.out.println("Esse é o menor número " + menor);

        ler.close();
    }
}

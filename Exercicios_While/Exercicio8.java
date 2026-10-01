//Alexandre Vital de Oliveira Arcanjo
package Exercicios_While;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double media, n1, n2;
        int i = 1;

        while (i <= 5) {
            do {
                System.out.println("Digite a primeira nota (0 a 10):");
                n1 = ler.nextDouble();
            } while (n1 < 0 || n1 > 10);

            do {
                System.out.println("Digite a segunda nota (0 a 10):");
                n2 = ler.nextDouble();
            } while (n2 < 0 || n2 > 10);

            media = (n1 + n2) / 2.0;

            System.out.println("A média do aluno " + i + " foi: " + media);
            i++;
        }

        ler.close();
    }
}

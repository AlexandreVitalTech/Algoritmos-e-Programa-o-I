//Alexandre Vital de Oliveira Arcanjo
package Exercicios_While;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int i = 1;

        while (i <= 10) {
            System.out.println("Digite o " + i + "º número:");
            int numero = ler.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            i++;
        }

        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);

        ler.close();
    }
}

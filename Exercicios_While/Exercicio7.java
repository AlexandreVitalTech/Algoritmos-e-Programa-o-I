//Alexandre Vital de Oliveira Arcanjo
package Exercicios_While;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        double imc = 0;
        double alt = 0;
        double peso = 0;
        int cont = 0;
        int i = 1;
        Scanner ler = new Scanner(System.in);

        while (i <= 10) {
            System.out.println("Digite seu peso");
            peso = ler.nextDouble();
            System.out.println("Digite sua altura");
            alt = ler.nextDouble();
            imc = peso / (alt * alt);

            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Você não é considerado obeso");
                cont++;
            }

            i++;
        }

        System.out.println("Total de pessoas sem obesidade: " + cont);
        ler.close();
    }
}

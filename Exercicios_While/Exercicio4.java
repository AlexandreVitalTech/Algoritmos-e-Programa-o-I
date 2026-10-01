//Alexandre Vital de Oliveira Arcanjo
package Exercicios_While;
public class Exercicio4 {
    public static void main(String[] args) {
        double half;
        double i = 10;

        while (i <= 20) {
            half = i / 2.0;
            System.err.println("A metade de " + i + " é igual a " + half);
            i++;
        }
    }
}

import java.util.Scanner;

public class Exercicio1_If {
    public static void main (String[] args){
        double num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número maior que 20");
        num = ler.nextInt();
        if (num > 20){
            double half = num / 2;
            System.out.println("Metade do número: " + half);
        } else { 
            System.out.println("o número precisa ser maior que 20 para ser dividido.");
        }
        ler.close();
    }
}
import java.util.Scanner;   
public class Exercicio12 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o número");
        double num = leia.nextDouble();
        double quad = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);
        double sqrt = Math.sqrt(num);
        double elev = Math.pow(num, 10);

        System.out.println("Quadrado do número: "+quad);
        System.out.println("Cubo do número: "+cubo);
        System.out.printf("Raiz quadrada do número:  %.2f.%n",sqrt);
        System.out.println("Número elevado a 10: "+elev);

        leia.close();
    }
}
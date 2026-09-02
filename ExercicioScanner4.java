import java.util.Scanner;
public class ExercicioScanner4 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        int num1 = leia.nextInt();
        
        System.out.println("Digite o segundo número");
        int num2 = leia.nextInt();

        System.out.println("Digite o terceiro número");
        int num3 = leia.nextInt();
        
        System.out.println("Digite o quarto número");
        int num4 = leia.nextInt();
        int res = num1 + num2+ num3 + num4;
        System.out.println("A soma de todos os números é " + res);

        leia.close();
    }
}

import java.util.Scanner;
public class ExercicioScanner3 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = leia.nextInt();
        
        System.out.println("Digite o segundo número");
        int num2 = leia.nextInt();

        System.out.println("O produto dos dois números é "+num1*num2);

        leia.close();
    }
}

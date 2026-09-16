import java.util.Scanner;

public class Exercicio3_If {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);   
     int num1, num2, diff;
     
     System.out.println("Digite o primeiro número, inteiro:");
     num1 = ler.nextInt();

     
     System.out.println("Digite o primeiro número, inteiro:");
     num2 = ler.nextInt();

     if (num1 == num2){
     System.out.println("Os números são iguais!");
     } else if (num1 > num2){
        diff = num1 - num2;
     System.out.println("A diferença entre os dois é: " + diff);
     } else {
        diff = num2 - num1;
     System.out.println("A diferença entre os dois é: " + diff);
     }
     ler.close();
    }
}

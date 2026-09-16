import java.util.Scanner;

public class Exercicio10_If {   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1,num2,num3;

        System.out.println("Digite o primeiro número inteiro");
        num1 = ler.nextInt();
        
        System.out.println("Digite o segundo número inteiro");
        num2 = ler.nextInt();
        
        System.out.println("Digite o terceiro número inteiro");
        num3 = ler.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("Todos os números são iguais!");
        } else if (num1 >= num2 && num1 >= num3){
            System.out.println("O maior número é: "+ num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println("O maior número é: "+ num2);
        } else {
            System.out.println("O maior número é: "+ num3);
        }
        ler.close();
    }
    
}

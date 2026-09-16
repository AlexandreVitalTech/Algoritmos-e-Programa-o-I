import java.util.Scanner;

public class Exercicio2_If {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);   
     int idade;
     
     System.out.println("Digite a idade: ");
     idade = ler.nextInt();
     if (idade >= 18){
        System.out.println("É uma pessoa maior de idade.");
     } else {
        System.out.println("É uma pessoa menor de idade.");
     }
     ler.close();
    }
}

//Autor: Alexandre Vital de Oliveira Arcanjo

package Exercicios_Switch;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 7:");
        int num = ler.nextInt();

        switch(num){
            case 1: 
                System.out.println("O dia correspondente ao número é Domingo");
            break;
            case 2:
                System.out.println("O dia correspondente ao número é Segunda-feira");
            break;
            case 3: 
                System.out.println("O dia correspondente ao número é Terça-feira");   
            break;
            case 4:
                System.out.println("O dia correspondente ao número é Quarta-feira");
            break;
            case 5:
                System.out.println("O dia correspondente ao número é Quinta-feira");
            break;
            case 6:
                System.out.println("O dia correspondente ao número é Sexta-feira");
            break;
            case 7:
                System.out.println("O dia correspondente ao número é Sabado");
            break;  
            
            default:
                System.out.println("Número não aceito!");
        
        }
        ler.close();
    }
}

package Exercicios_Switch;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número, de 1 a 12");
        int numero = ler.nextInt();

        switch(numero){
            case 1: 
                System.out.println("O mês correspondente ao número é Janeiro");
            break;
            case 2:
                System.out.println("O mês correspondente ao número é Fevereiro");
            break;
            case 3: 
                System.out.println("O mês correspondente ao número é Março");   
            break;
            case 4:
                System.out.println("O mês correspondente ao número é Abril");
            break;
            case 5:
                System.out.println("O mês correspondente ao número é Maio");
            break;
            case 6:
                System.out.println("O mês correspondente ao número é Junho");
            break;
            case 7:
                System.out.println("O mês correspondente ao número é Julho");
            break;  
            case 8:
                System.out.println("O mês correspondente ao número é Agosto");
            break;
            case 9:
                System.out.println("O mês correspondente ao número é Setembro");
            break;
            case 10:
                System.out.println("O mês correspondente ao número é Outubro");
            break;
            case 11:
                System.out.println("O mês correspondente ao número é Novembro");
            break; 
            case 12:
                System.out.println("O mês correspondente ao número é Dezembro");
            break; 
            
            default:
                System.out.println("Numero invalido!");
        }
        ler.close();
        
    }
}

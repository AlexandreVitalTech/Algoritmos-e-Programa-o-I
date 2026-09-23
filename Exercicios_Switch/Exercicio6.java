package Exercicios_Switch;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        Double valor;
        System.out.println("O que vai querer do cardápio, com base no número?");
        System.out.println("20 - Refrigerante: R$ 4,50");
        System.out.println("21 - Coxinha: R$ 3,00");
        System.out.println("22 - Bolinha de queijo: R$ 2,50");
        System.out.println("23 - Pão de Frios: R$ 6,00");
        System.out.println("24 - Pastel Frito: R$ 7,00");
        int numero = ler.nextInt();

        System.out.println("Quantos vai querer?");
        int quant = ler.nextInt();

        switch (numero) {
            case 20:
                valor = quant * 4.50;  
                System.out.println("Refrigerante");  
                System.out.println("Valor a ser pago: R$"+valor);      
                break;
            case 21:
                valor = quant * 3.00;  
                System.out.println("Coxinha");  
                System.out.println("Valor a ser pago: R$"+valor);      
                break;
            case 22:
                valor = quant * 2.50;  
                System.out.println("Bolinha de queijo");  
                System.out.println("Valor a ser pago: R$"+valor);      
                break;
            case 23:
                valor = quant * 6.00;  
                System.out.println("Pão de Frios");  
                System.out.println("Valor a ser pago: R$"+valor);      
                break;
            case 24:
                valor = quant * 7.00;  
                System.out.println("Pastel Frito");  
                System.out.println("Valor a ser pago: R$"+valor);      
                break;
            default:
                System.out.println("Este número não está no cardápio! Escolha um valor válido."); 
        }
        ler.close();
    }
}
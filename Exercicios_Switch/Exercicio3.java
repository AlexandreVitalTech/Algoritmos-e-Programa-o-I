//Autor: Alexandre Vital de Oliveira Arcanjo

package Exercicios_Switch;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o turno em que você estuda");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        String turno = ler.nextLine().toUpperCase();

        switch (turno) {
            case "M":
                System.out.println("Bom Dia!");                
                break;
            case "V":
                    System.out.println("Boa Tarde!");                
                break;
            case "N":
                System.out.println("Boa Noite!");                
                break;
            default:
                System.out.println("Turno inválido! Escreva M, V ou N");
        }  
        ler.close();      
    }
}
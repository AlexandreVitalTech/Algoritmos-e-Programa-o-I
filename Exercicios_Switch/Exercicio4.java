//Autor: Alexandre Vital de Oliveira Arcanjo

package Exercicios_Switch;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);

        Double newSalario;
        System.out.println("Digite seu plano de trabalho");
        System.out.println(" - A \n - B \n - C");
        String plano = ler.nextLine().toUpperCase();

        System.out.println("Qual seu salário?");
        Double salario = ler.nextDouble();

        switch (plano) {
            case "A":
                newSalario = (salario * 0.10) + salario;
                System.out.println("Seu novo salário será de "+ newSalario);               
                break;
            case "B":
                newSalario = (salario * 0.15) + salario;
                System.out.println("Seu novo salário será de "+ newSalario);               
                break;
            case "C":
                newSalario = (salario * 0.20) + salario;
                System.out.println("Seu novo salário será de "+ newSalario);               
                break;
            default:
                System.out.println("Plano de trabalho inválido! Escolha entre A, B ou C.");
        }
        ler.close();
    }
}

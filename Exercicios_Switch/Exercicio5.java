//Autor: Alexandre Vital de Oliveira Arcanjo
 
package Exercicios_Switch;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double resul;
        System.out.println("Digite a operação desejada:");
        System.out.println("M - Média dos valores");
        System.out.println("S - Diferença do maior pelo menor");
        System.out.println("P - O produto entre os valores");
        System.out.println("D - A divisão do primeiro pelo segundo");
        String operacao = ler.nextLine().toUpperCase();
        
        System.out.println("Digite o primeiro número");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = ler.nextInt();

        switch (operacao) {
            case "M":
                resul = (num1 + num2) / 2;
                System.out.println("A media dos valores é "+ resul);
            break;
            case "S":
                if(num1 > num2){
                    System.out.println("O número 1 é maior que o número 2");
                }else{
                    System.out.println("O número 2 é maior que o número 1");
                }
            break;
            case "P":
                resul = num1 * num2;
                System.out.println("O produto dos valores é "+ resul);
            break;
            case "D":
                resul = num1 / num2;
                System.out.println("A divisão do 1 pelo 2 é "+ resul);
            break;
            default:
                System.out.println("Operação inválida! Selecione uma das quatro.");
        }
        ler.close();        
    }    
}
import java.util.Scanner;

public class Exercicio11_If {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.println("Qual a idade do nadador?");
        idade = ler.nextInt();

        if (idade >= 5 && idade <=7){
            System.out.println("Sua categoria é: Infantil A");
        } else if (idade >= 8 && idade <=10) {
            System.out.println("Sua categoria é: Infantil B");
        } else if (idade >= 11 && idade <=13) {
            System.out.println("Sua categoria é: Juvenil A");
        } else if (idade >= 14 && idade <=17) {
            System.out.println("Sua categoria é: Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Sua categoria é: Senior");
        } else {
            System.out.println("Idade inválida! Pessoa nova demais.");
        }
        ler.close();
    }
}

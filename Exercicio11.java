import java.util.Scanner;   
public class Exercicio11 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int idade = leia.nextInt();
        
        System.out.println("Digite o ano atual");
        int ano = leia.nextInt();
        
        int anoNasc = ano - idade;
        int idadeFut = (2030 - ano) + idade;

        System.out.println("A sua idade em 2030 será "+idadeFut+" e agora você tem "+idade);

        leia.close();
    }
}
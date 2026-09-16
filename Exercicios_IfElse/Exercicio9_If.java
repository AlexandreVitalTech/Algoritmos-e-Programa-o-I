import java.util.Scanner;

public class Exercicio9_If {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    double salBruto, prestacao, limitePres;

    System.out.println("Digite o salário bruto");
    salBruto = ler.nextDouble();

    System.out.println("Digite o valor da prestação");
    prestacao = ler.nextDouble();

    limitePres = salBruto * 0.30;

    if(prestacao <= limitePres){
        System.out.println("O empréstimo vai ser concedido!");
    } else {
        System.out.println("O empréstimo não pode ser realizado!");
    }
    ler.close();
    }    
}

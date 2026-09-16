import java.util.Scanner;

public class Exercicio13_If {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num1,num2,res = 0;
        char op;

        System.out.println("Digite o primeiro valor:");
        num1 = ler.nextInt();

        System.out.println("Digite o segundo valor:");
        num2 = ler.nextInt();

        System.out.println("Qual operação quer realizar? (Entre +, -, * e /):");
        op = ler.next().charAt(0);

        if (op == '+'){
            res = num1 + num2;
        } else if (op == '-'){
            res = num1 - num2;
        } else if (op == '*'){
            res = num1 * num2;
        } else if (op == '/'){
            if (num2 != 0){
                res = num1 / num2;
            }else{
                System.out.println("Impossível dividir por 0!");
            }
        }else{
            System.out.println("Operação inválida.");
        }
        System.out.println("O resultado é: "+ res);
        ler.close();
    }
}

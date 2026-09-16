import java.util.Scanner;

public class Exercicio7_If {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double sal,bonus;
        int anosTrab;

        System.out.println("Qual o salário do funcionario?");
        sal = leia.nextDouble();
        
        System.out.println("Quantos anos ele trabalhou?");
        anosTrab = leia.nextInt();
        
        if(anosTrab >= 5){
            bonus = sal *0.20;
        } else {
            bonus = sal *0.10;
        }
        System.out.println("O valor do bônus é de: "+bonus+" reais.");
        leia.close();
    }
    
}

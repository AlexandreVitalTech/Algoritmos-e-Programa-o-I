import java.util.Scanner;

public class Exercicio8_If {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String senha;
        
        System.out.println("Digite a senha: ");
        senha = ler.nextLine();

        if (senha.equals("R10p5")){
            System.out.println("Acesso liberado.");
        } else { 
            System.out.println("Acesso negado.");
        }
        ler.close();
    }  
 }
    

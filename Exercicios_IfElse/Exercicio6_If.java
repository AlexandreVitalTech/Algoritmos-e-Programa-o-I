
import java.util.Scanner;

public class Exercicio6_If {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        double altura, pesoId;
        String sexo;

        System.out.println("Digite a altura em metros: ");
        altura = ler.nextInt();

        System.out.println("Digite o seu sexo. F para feminino e M para masculino: ");
        sexo = ler.nextLine();

        if (sexo.toUpperCase() == "M"){
            pesoId = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal seria de: "+ pesoId);
        } else if (sexo.toUpperCase() == "F"){
            pesoId = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal seria de: "+ pesoId);
        }
        ler.close();
       }
}

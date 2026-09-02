import java.util.Scanner;   
public class ExercicioScanner5 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        int n1 = leia.nextInt();
        
        System.out.println("Digite a segunda nota");
        int n2 = leia.nextInt();
        
        double media = (n1*n2)/2;

        System.out.println("A média aritmética é "+media);

        leia.close();
    }
}
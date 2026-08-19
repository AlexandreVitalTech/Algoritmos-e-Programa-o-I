import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        List<String> livros = new ArrayList();
        for (int i = 1; i <= 5; i++){
            System.out.println("Insira o título do " + i + "º livro favorito.");
            livros.add(leia.nextLine());
        }        
        System.out.println("Seus livros favoritos são:");
        for (int i = 1; i <= 5; i++){
            int livrosIndex = i-1;
            System.out.println(i+"º Lugar: "+ livros.get(livrosIndex));
        } 
        leia.close();
    }
}

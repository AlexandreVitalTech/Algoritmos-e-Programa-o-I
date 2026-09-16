
import java.util.Scanner;

public class Desafio_If {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     int idade;
     char bras,conscr,alfab,tituloReg,direitosPolAt;
     
    System.out.println("Qual a idade da pessoa no dia da eleição?");
    idade = ler.next().toUpperCase().charAt(0);

    System.out.println("A pessoa é de nacionalidade brasileira? (S/N)");
    bras = ler.next().toUpperCase().charAt(0);

    System.out.println("A pessoa está cumprindo prazo com o serviço militar? (S/N)");
    conscr = ler.next().toUpperCase().charAt(0);

    System.out.println("A pessoa é alfabetizada? (S/N)");
    alfab = ler.next().toUpperCase().charAt(0);

    System.out.println("A pessoa possui um titulo eleitoral regular? (S/N)");
    tituloReg = ler.next().toUpperCase().charAt(0);

    System.out.println("A pessoa tem os seus direitos politicos ativos? (S/N)");
    direitosPolAt = ler.next().toUpperCase().charAt(0);

    if (idade < 16){
        System.out.println("A pessoa não tem idade suficiente para votar.");
    } else {
        if (bras != 'S'){
            System.out.println("A pessoa estrangeira não pode votar.");
        } else {
            if (conscr != 'N'){
                System.out.println("Durante o serviço militar obrigatório, a pessoa não pode votar."); 
            } else {
                if (tituloReg != 'S'){
                    System.out.println("A pessoa não pode votar sem um título de eleitor adequado.");
                } else{
                    if (direitosPolAt != 'S'){
                        System.out.println("A pessoa não pode votar com direitos políticos suspensos.");
                    } else {
                        if ((idade >= 18 && idade <= 70) && alfab == 'S'){
                            System.out.println("A pessoa está apta a votar e é obrigatório.");
                        } else if ((idade >= 16 && idade < 18) || idade >= 70){
                            System.out.println("A pessoa está apta a votar e é opcional.");
                        }
                    }
                }
            }
        }
    }
    ler.close();
    }
}

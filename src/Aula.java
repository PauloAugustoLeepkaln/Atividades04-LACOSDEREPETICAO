import java.util.Arrays;
import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {

        String TimeA = "";
        String TimeB = "";
        String[] nomesTimeA = new String[5];
        String[] nomesTimeB = new String[5];
        Scanner sc = new Scanner(System.in);

        //Inicialização; condição; incremento
        // ++ -> vai somar +1 i = i + 1

        System.out.println("Escreva o nome do primeiro time:");
        TimeA = sc.next();

        System.out.println("Escreva o nome do segundo time:");
        TimeB = sc.next();

        for(int i = 0; i < 5; i++ ) {
            System.out.println("informe os nomes do time "+TimeA);
            nomesTimeA[i] = sc.next();
        }
        for(int i = 0; i < 5; i++ ){
            System.out.println("informe os nomes do time "+TimeB);
            nomesTimeB[i] = sc.next();
        }

        System.out.println("Os nomes dos jogadores do time"+ TimeA+" são:"+ Arrays.toString(nomesTimeA));
        System.out.println("Os nomes dos jogadores do time"+ TimeB+" são:"+ Arrays.toString(nomesTimeB));

        // Pedir o nome do time A
        // Pedir os nomes do time A (5 nomes)
        // Pedir o nome do time B
        // Pedir os nomes do time B (5 nomes)

    }
}

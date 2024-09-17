import java.util.Random;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu chute: ");
            palpite = scanner.nextInt();

            if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            }
        } while (palpite != numeroAleatorio);

        System.out.println("Parabéns! Você adivinhou o número: " + numeroAleatorio);

    }
}

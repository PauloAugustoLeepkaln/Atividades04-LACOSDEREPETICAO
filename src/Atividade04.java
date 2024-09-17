import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade;

        do {
            System.out.print("Digite uma idade válida (maior que 0): ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                System.out.println("Idade inválida. Tente novamente.");
            }
        } while (idade <= 0);

        System.out.println("Idade válida fornecida: " + idade);
    }
}

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int i = numero;

        do {
            fatorial *= i;
            i--;
        } while (i > 0);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);


    }
}

package curso.exercicios;

import java.util.Scanner;

public class vetora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de elementos
        System.out.print("Quantos numeros voce vai digitar? ");
        int N = scanner.nextInt();

        // Verifica se o valor de N está dentro do limite
        if (N > 0 && N <= 10) {
            int[] numeros = new int[N];

            // Leitura dos números
            for (int i = 0; i < N; i++) {
                System.out.print("Digite um numero: ");
                numeros[i] = scanner.nextInt();
            }

            // Exibição dos números negativos
            System.out.println("NUMEROS NEGATIVOS:");
            for (int i = 0; i < N; i++) {
                if (numeros[i] < 0) {
                    System.out.println(numeros[i]);
                }
            }
        } else {
            System.out.println("O numero deve ser entre 1 e 10.");
        }

        scanner.close();
    }
}

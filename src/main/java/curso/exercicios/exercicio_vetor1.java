package curso.exercicios;

import java.util.Scanner;


/*
Faça um programa que leia um número inteiro positivo N (máximo = 10)
e depois N números inteiros e armazene-os em um vetor. Em seguida,
mostrar na tela todos os números negativos lidos.

Exemplo:
Quantos numeros voce vai digitar? 4
Digite um numero: 8
Digite um numero: -2
Digite um numero: 9
Digite um numero: 10

NUMEROS NEGATIVOS:
-2

 */


public class exercicio_vetor1 {
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

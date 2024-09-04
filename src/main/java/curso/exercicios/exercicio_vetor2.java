package curso.exercicios;

import java.util.Scanner;

public class exercicio_vetor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*

        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
        Exemplo:
        Quantos numeros voce vai digitar? 4
        Digite um numero: 8.0
        Digite um numero: 4.0
        Digite um numero: 10.0
        Digite um numero: 14.0
        VALORES = 8.0 4.0 10.0 14.0
        SOMA = 36.00
        MEDIA = 9.00


         */
        // Pergunta quantos números o usuário deseja digitar
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        // Cria um vetor para armazenar os números reais
        double[] vetor = new double[n];

        // Lê os números e armazena no vetor
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
        }

        // Imprime todos os elementos do vetor
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Calcula a soma e a média dos elementos
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        double media = soma / n;

        // Exibe a soma e a média
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);

        scanner.close();
    }
}

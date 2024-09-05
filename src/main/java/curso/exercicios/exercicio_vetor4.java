package curso.exercicios;

import java.util.Scanner;


/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
Exemplo:
Quantos numeros voce vai digitar? 3
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11

NUMEROS PARES:
8 2 14 20
QUANTIDADE DE PARES = 4
 */

public class exercicio_vetor4 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros serão digitados?");
        int numeros = sc.nextInt();
        sc.nextLine();

        int[] vetor = new int[numeros];

        for (int i = 0; i < numeros; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
            sc.nextLine();
        }

        int countPares = 0; // initialize a counter for even numbers
        System.out.println("Números pares:");
        for (int i = 0; i < numeros; i++) {
            if (vetor[i] % 2 == 0) { // check if the number is even
                System.out.println(vetor[i]);
                countPares++; // increment the counter if the number is even
            }
        }
        System.out.println("Quantidade de pares: " + countPares); // print the total count of even numbers






    }
}
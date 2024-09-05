package curso.exercicios;

import java.util.Scanner;


/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
Digite um numero: 13.0
Digite um numero: 7.0
MAIOR VALOR = 14.0
POSICAO DO MAIOR VALOR = 3
 */

public class exercicio_vetor5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("quantos numeros serão digitadao?");
        int numDigitados = sc.nextInt();
        sc.nextLine();

        int[] maiorPosicao = new int[numDigitados]  ;
        for (int i = 0; i < numDigitados; i++) {
            maiorPosicao[i] = sc.nextInt();

        }

        int max = maiorPosicao[0] ;
        int max_index = 0;

        for (int i = 1; i < numDigitados; i++) {
            if (maiorPosicao[i] > max) {
                max = maiorPosicao[i];
                max_index = i;
            }
        }

        System.out.println("MAIOR VALOR = " + max);
        System.out.println("POSICAO DO MAIOR VALOR = " +  max_index);



    }
}
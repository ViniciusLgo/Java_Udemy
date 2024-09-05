package curso.exercicios;

import java.util.Scanner;


/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
Exemplo:
Quantas pessoas voce vai digitar? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 16
Dados da 4a pessoa:
Nome: Carlos
Idade: 23
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
PESSOA MAIS VELHA: Carlos
 */

public class exercicio_vetor6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();  // Consumir a quebra de linha pendente
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        // Encontrar a pessoa mais velha
        int maisVelhaIndex = 0;
        for (int i = 1; i < n; i++) {
            if (idades[i] > idades[maisVelhaIndex]) {
                maisVelhaIndex = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[maisVelhaIndex]);

        sc.close();
    }
}
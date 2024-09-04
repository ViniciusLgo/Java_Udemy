package curso.exercicios;

import java.util.Scanner;

public class exercicio_vetor3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("quantas pessoas serão digitadas?");
        int numPessoas = sc.nextInt();
        sc.nextLine();


        String[] nomes = new String[numPessoas];
        int[] idades = new int[numPessoas];
        double[] alturas = new double[numPessoas];


        for (int i = 0; i < numPessoas; i++) {

            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            sc.nextLine(); // Limpa o buffer do teclado após a leitura de um número
        }

        double somaaltura = 0.0;
        for (int i = 0; i < numPessoas; i++) {
            somaaltura += alturas[i];  // somaaltura = somaaltura + idades[i] * alturas[i];
        }

        double media = somaaltura / numPessoas;

        int contMenor = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (idades[i]<16){
                contMenor++;
            }
        }

        double porcentagemMenor = contMenor / numPessoas;

        // Imprime os resultados
        System.out.println();
        System.out.printf("Altura média = %.2f%n", alturas[contMenor]);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenor);
        System.out.println();

        // Mostra os nomes das pessoas com menos de 16 anos
        if ( contMenor > 0) {
            System.out.println("Nomes das pessoas com menos de 16 anos:");
            for (int i = 0; i < numPessoas; i++) {
                if (idades[i] < 16) {
                    System.out.println(nomes[i]);
                }
            }
        }

        sc.close();
    }
}
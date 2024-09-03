package curso.exercicios;

import java.util.Scanner;

public class vini_solo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("quantos numeros vc vai digitar?");
        int n = scanner.nextInt();


        if (n > 0 && n <= 10){
            int[] numeros = new int[n];


            for (int i = 0; i < n; i++){
                System.out.println("digite um numero: ");
                numeros[i] = scanner.nextInt();
            }


            System.out.println("numeros negativos");
            for (int i = 0; i < n; i++) {
                if (numeros[i] < 0) {
                    System.out.println(numeros[i]);
                }
            }
        } else {
            System.out.println("numeros vazios");
        }


    }
}
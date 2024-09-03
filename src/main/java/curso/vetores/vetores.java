package curso.vetores;

import java.util.Scanner;

public class vetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        product_vetores[] vect = new product_vetores[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new product_vetores(name, price);
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("average %.2f%n",avg);

    }
}

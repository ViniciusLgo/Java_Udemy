package curso.foreach;

import java.util.Scanner;

public class foreach {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[] { "maria", "bob", "alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);

        }

        System.out.println("-----------");

        for (String obj : vect) {
            System.out.println(obj);
        }



    }
}

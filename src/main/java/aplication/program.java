package aplication;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("ENTER ACCOUNT NUMBER: ");
        int number = sc.nextInt();
        System.out.print("ENTER ACCOUNT HOLDER: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (Y/n) ?");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.print("ENTER INITIAL DEPOSIT VALUE: ");
            double inicialDepositValue = sc.nextDouble();
            account = new Account(number,holder,inicialDepositValue);

        } else {
            account = new Account(number,holder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Deposit: " + depositValue);
        System.out.println(account);


        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("withdraw: " + withdrawValue);
        System.out.println(account);





        sc.close();

    }
}

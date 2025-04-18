package oops;

import java.util.Scanner;

public class atm {

    class AtmMachine {
        float balance;
        int PIN;

        public void Checkpin() {
            System.out.println("Enter your pin :  ");
            Scanner sc = new Scanner(System.in);
            int enteredPin = sc.nextInt();
            if (enteredPin == PIN) {
                menu();

            } else {
                System.out.println("Invalid Pin ! , Enter correct Pin .");
            }
        }

        public void menu() {

            System.out.println("1. Check balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Transfer");
            System.out.println("4. other/Settings");
            System.out.println("5. Exit");
            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();
            // if (opt == 1) {
            //     checkBalance();
            // } else if (opt == 2) {
            //     WithdrawMoney();
            // } else if (opt == 3) {
            //     transfer();
            // } else if (opt == 4) {
            //     other();
            // } else if (opt == 5) {
            //     Exit();
            // }
        }
    }

    public static void main(String[] args) {
        // Checkpin();
    }
}

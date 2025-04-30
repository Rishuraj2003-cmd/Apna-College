package oops;

import java.util.Scanner;

public class atm {

    static class AtmMachine {
        float balance;
        int PIN = 1234;
        Scanner sc = new Scanner(System.in);

        public void checkPin() {
            System.out.print("Enter your pin :  ");
            Scanner sc = new Scanner(System.in);
            int enteredPin = sc.nextInt();
            if (enteredPin == PIN) {
                menu();

            } else {
                System.out.print("Invalid Pin ! , Enter correct Pin .");
                checkPin(); // retry
            }
            sc.close();
        }

        public void menu() {

            System.out.println("1. Check balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money ");
            System.out.println("4. Exit");
            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();
           
            if (opt == 1) {
                checkBalance();
            } else if (opt == 2) {
                WithdrawMoney();
            } else if (opt == 3) {
                depositMoney();
            }
             else if (opt == 4) {
                sc.close();
                return  ;
              
            } else {
                System.out.print("Enter correct option.");
            }
            sc.close();
        }

        public void checkBalance() {
            System.out.println("Current Balance : ₹ " + balance);
            menu();
        }

        public void WithdrawMoney() {
            System.out.print("Enter Amount : ₹");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextInt();
            if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawal money successful.");
            }
            menu();
            sc.close();
        }

        public void depositMoney() {
            System.out.print("Enter amount : ₹");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextInt();
            balance = balance + amount;

            menu();
            sc.close();
        }

    }

    public static void main(String[] args) {
        // Checkpin();
        AtmMachine sbiAtm = new AtmMachine();
        sbiAtm.checkPin();

    }
}

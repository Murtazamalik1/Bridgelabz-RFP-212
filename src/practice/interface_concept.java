package practice;
import java.util.Scanner;

//public class interface_concept {
    class Main {
        public static void main(String[] args) {
            ATM atm = new IciciAtm();
            atm.withdraw();
        }
    }

    interface ATM {
        int withdraw();

        int deposit();

        int checkBalance();

        int pinChange();
    }

    class IciciAtm implements ATM {

        private static int availableBalance = 1800;
        private static int pin = 1099;
        Scanner scanner = new Scanner(System.in);

        @Override
        public int withdraw() {
// amount
            System.out.println("Enter Amount");
            int withdrawAmount = scanner.nextInt();


// pin
            System.out.println("Enter Pin");
            int pin = scanner.nextInt();

// validate
            if (pin == IciciAtm.pin) {
                if (availableBalance >= withdrawAmount) {
                    availableBalance -= withdrawAmount;
                    printBalance();
                    return withdrawAmount;
                } else {
                    System.out.println("Insufficient Amount");
                }
            } else {
                System.out.println("Invalid Pin");
            }
            return 0;
        }

        private void printBalance() {
            System.out.println("Remaining Balance is : " + availableBalance);
        }

        @Override
        public int deposit() {
            return 0;
        }

        @Override
        public int checkBalance() {
            return 0;
        }

        @Override
        public int pinChange() {
            return 0;
        }
}

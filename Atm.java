import java.util.*;

public class Atm {
    public static void main(String[] args) {
        int balance = 5000, with, depositted, money;
        Scanner sc = new Scanner(System.in);
        boolean first=true;
        while (first) {
            System.out.println("---------------------------------");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Transfer");
            System.out.println("Choose 5 for Exit");
            System.out.println("---------------------------------");
            int t = sc.nextInt();
            switch (t) {
                case 1:
                    System.out.println("Enter money to be Withdrawn");
                    with = sc.nextInt();
                    if (balance >= with) {
                        balance -= with;
                        System.out.println("********************************");
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("********************************");
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 2:
                    System.out.println("Enter money to be Deposited");
                    depositted = sc.nextInt();
                    balance += depositted;
                    System.out.println("********************************");
                    System.out.println("Your Money has been Successfully Deposited");
                    break;
                case 3:
                    System.out.println("Balance=" + balance);
                    break;
                case 4:
                    System.out.println("Enter money to be Transfer");
                    money = sc.nextInt();
                    if (balance >= money) {
                        balance -= money;
                        System.out.println("********************************");
                        System.out.println("Your Money has been Successfully Transferred");
                    } else {
                        System.out.println("********************************");
                        System.out.println("Insufficient Funds");
                    }
                    break;
                case 5:
                    System.out.println("********************************");
                    System.out.println("Thanks You");
                    System.out.println("********************************");
                    System.out.println("Visit Again");
                    first=false;
                    break;
                default:
                    System.out.println("Atm isn't Working. Please after few hours");
                    System.out.println("********************************");
                    first=false;
                    break;
            }
        }
    }
}

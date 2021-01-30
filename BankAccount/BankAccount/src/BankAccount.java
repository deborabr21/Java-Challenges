import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userChoice;
        boolean quit = false;
        float balance = 0;
        while (! quit){
            System.out.println("0: Quit");
            System.out.println("1: Deposit Money");
            System.out.println("2: Withdraw Money");
            System.out.println("3: Check Balance");
            System.out.println();
            System.out.println("Enter you choice: ");
            userChoice = scan.nextInt();
            switch (userChoice){
                case 1:
                    float amount;
                    System.out.println("Enter the amount to deposit: ");
                    amount = scan.nextFloat();
                    if (amount <=0){
                        System.out.println("Insufficient amount to deposit.");
                    }else{
                        balance += amount;
                        System.out.println("$" + amount + " was deposited into your account.");
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw: ");
                    amount = scan.nextFloat();
                    if (balance <= 0){
                        System.out.println("You have insufficient funds.");
                    }else{
                        balance -= amount;
                        System.out.println("$" + amount + " was withdrawn from your account. Your remaining balance is $" + balance);
                    }
                    break;
                case 3:
                    System.out.println("Your current balance is $" + balance);
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
            System.out.println("Have a great day! Goodbye!");
        }
    }
}

import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // get present balance from user
        System.out.print("Enter present balance: ");
        double balance = scanner.nextDouble();
        
        // show options to user
        System.out.println("Choose an option:");
        System.out.println("1. Withdrawal");
        System.out.println("2. Deposit");
        System.out.println("3. Check balance");
        
        // get user's choice
        int choice = scanner.nextInt();
        
        // perform action based on user's choice
        switch(choice) {
            case 1:
                // withdrawal
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                if(withdrawAmount > balance) {
                    System.out.println("Error: Withdrawal amount exceeds balance");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful");
                }
                break;
            case 2:
                // deposit
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                balance += depositAmount;
                System.out.println("Deposit successful");
                break;
            case 3:
                // check balance
                System.out.println("Current balance: " + balance);
                break;
            default:
                // invalid choice
                System.out.println("Error: Invalid choice");
                break;
        }
        
        scanner.close();
    }
}

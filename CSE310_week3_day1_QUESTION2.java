import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double borrowedAmount = sc.nextDouble();
        double interest = 0.1 * borrowedAmount;
        double totalAmount = borrowedAmount + interest;
        double emi = totalAmount / 12;

        System.out.println((int)totalAmount);
        System.out.printf("%.2f",emi);
    }
}

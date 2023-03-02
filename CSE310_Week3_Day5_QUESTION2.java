import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     

        int n = sc.nextInt();

        if (n >= 0 && n < 100) {

            for (int i = 0; i <= n; i++) {

                System.out.println(i);

            }

            System.out.println("Games End");

        } else if (n < 0) {

            System.out.println("Invalid Input");

        }

    }

}

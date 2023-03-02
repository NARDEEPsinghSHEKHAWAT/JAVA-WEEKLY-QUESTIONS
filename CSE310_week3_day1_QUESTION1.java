import java.util.Scanner;

public class Main {

    public static void main(String...args) {

        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        char singleChar = sc.nextLine().charAt(0);

        int n = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == singleChar) {

                n++;

            }

        }

        System.out.println(n);

    }

}

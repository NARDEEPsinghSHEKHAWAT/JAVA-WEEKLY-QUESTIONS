import java.util.Scanner;
public class BracketGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bracketTags = scanner.nextLine();
        String name = scanner.nextLine();
        String result = bracketTags.substring(0, 2) + name + bracketTags.substring(2);
        System.out.println(result);
        scanner.close();
    }}

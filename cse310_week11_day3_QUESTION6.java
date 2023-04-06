import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine().toUpperCase();
        String word2 = sc.nextLine().toUpperCase();

        if (word1.length() < 3 || word2.length() < 3) {
            System.out.println("ERROR");
        } else {
            String firstThreeCharsWord1 = word1.substring(0, 3);
            String lastThreeCharsWord2 = new StringBuilder(word2.substring(word2.length() - 3)).reverse().toString();
            
            if (firstThreeCharsWord1.equals(lastThreeCharsWord2)) {
                System.out.println("GREAT");
            } else {
                System.out.println("TRY NEXT TIME");
            }
        }
        sc.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

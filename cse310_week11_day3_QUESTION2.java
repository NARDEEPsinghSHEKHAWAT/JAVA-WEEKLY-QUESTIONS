import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if length is same
        if(str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result)
            {
                System.out.println("ANAGRAM");
            }
            else
            {
                System.out.println("NOT ANAGRAM");
            }
        }
        else
        {
            System.out.println("NOT ANAGRAM");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

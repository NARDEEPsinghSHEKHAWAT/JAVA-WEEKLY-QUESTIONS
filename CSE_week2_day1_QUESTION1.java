import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String n=sc.nextLine();
        int m=Integer.parseInt(n, 2);
        if (m<65||m>90) {
            System.out.println("INVALID PAPER CODE");
     
        } else {
            System.out.println((char)m);
              }
    }
}

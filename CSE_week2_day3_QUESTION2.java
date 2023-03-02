import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        j=j*100;
        int a=j/i;
        if(a>75)
        {
            System.out.println(a);
             System.out.printf("Yes");            
        }
        else
        {
            System.out.println(a);
             System.out.println("No");
        }
    }
}

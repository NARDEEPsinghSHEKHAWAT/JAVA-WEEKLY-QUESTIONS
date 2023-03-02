import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=sc.nextInt();
        double n=sc.nextDouble();
        if(j==1)
        {
            double a=n-32;
            a=a*5;
            a=a/9;
            System.out.printf("%.2f",a);
        }
        else
        {
            double a=n*9;
            a=a/5;
            a=a+32;
            a=Math.round(a * 100.0) / 100.0;
            System.out.println(a);
        }
    }
}

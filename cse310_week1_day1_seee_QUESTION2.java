import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double m=sc.nextDouble();
        double l=sc.nextDouble();
        double a=((n+m+l)/3);
        System.out.printf("%.1f",a-0.1);
    }
}

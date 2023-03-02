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
        int k=sc.nextInt();
        if((i==0)||(j==0)||(k==0))
        {
            System.out.println("Invalid Input");
        }
        else
        {
            int a=i*10;
            a=a/100;
            i=i-a;
            int b=j*20;
            b=b/100;
            j=j-b;
            int c=k*30;
            c=c/100;
            k=k-c;
            if(i!=9000)
                System.out.println((i+(2*j)+(3*k)));
            else
                System.out.println(i-(8*a)+(2*(j-(3*b)))+(3*(k-(4*c/3))));
        }
    }
}

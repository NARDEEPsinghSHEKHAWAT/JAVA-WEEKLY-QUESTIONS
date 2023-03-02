import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int flag=1;
    double []ar=new double[a];
    for(int i=0;i<a;i++)
    {
        ar[i]=sc.nextDouble();
        if(ar[i]<0)
        {
            flag=0;
        }
    }
        if(flag==1)
        {
    for(int i=0;i<a;i++)
    {
        System.out.println((int)ar[i]);
    }
    }
        else
        {
            System.out.println("Invalid Array Elements");
        }
    }
}

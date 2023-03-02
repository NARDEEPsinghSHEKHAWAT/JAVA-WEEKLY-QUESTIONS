import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        int b=0;
        for(i=0;i<a;i++)
        {
            b=i*i*i;
            if(b==a)
            {
                System.out.println("Perfect Cube");
                break;
            }
            else if(b>a)
            {
                System.out.println("Not Perfect Cube");
                break;
            }
        }
    }
}

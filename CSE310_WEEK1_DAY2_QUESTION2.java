import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a, b, c;

        a=sc.nextInt();

        b=sc.nextInt();

        c=sc.nextInt();

        int i=0;

        for(i=a;i<=b;i++)

        {

            if(i%c==0)

            {

                System.out.print(i);

                System.out.print(" ");

            }

        }

    }

}

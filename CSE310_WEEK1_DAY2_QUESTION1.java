import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        int b=a/2;  

        int i,flag=0;

  if(a==0||a==1){  

   System.out.println("Not Prime Number");      

  }else{  

   for(i=2;i<=b;i++){      

    if(a%i==0){      

     System.out.println("Not Prime Number");      

     flag=1;      

     break;      

    }      

   }      

   if(flag==0)  { System.out.println("Prime Number"); }  

  }//end o

    }

}

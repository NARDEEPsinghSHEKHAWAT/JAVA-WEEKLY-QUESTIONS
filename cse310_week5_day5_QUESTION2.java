import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     public static boolean isBigger(int a,int b){
         if(a>b){
             return true;
         }
         else{
             return false;
         }
     }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        boolean c= isBigger(a,b);
        System.out.println(c);
    }
}

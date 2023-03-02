import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if((n>=0)&&(m>=0))
        {
            System.out.println(n+"-"+m);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}

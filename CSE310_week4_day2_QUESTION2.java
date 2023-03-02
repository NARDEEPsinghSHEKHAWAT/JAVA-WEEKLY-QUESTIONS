import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumis=0;
        int [][]ar=new int[n][7];
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<7;j++)
            {
                ar[i][j]=sc.nextInt();
                sumis+=ar[i][j];
                arr[i]=sumis;
            }
            sumis=0;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==56)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
        
    }
}

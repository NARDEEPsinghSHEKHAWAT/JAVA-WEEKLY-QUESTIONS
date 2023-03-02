import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a<0)||(b<0))
        {
        System.out.println("0");
        }
        else
        {
            System.out.println((a*4)+(b*6));
        }
        
    }
}

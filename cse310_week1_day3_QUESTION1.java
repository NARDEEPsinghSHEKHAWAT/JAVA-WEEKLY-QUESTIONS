import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.*;

public  class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        sc.nextLine();
        String name=sc.nextLine();
        //sc.nextLine();
        char gender=sc.next().charAt(0);
        sc.nextLine();
        int a=sc.nextInt();
        if(a>=20000)
        {
            if(gender=='F')
            {
                System.out.println("Hi Ms. "+name+"!");
                System.out.println("Insufficient Funds! You can not withdraw "+a+".");
            }
            else
            {
                System.out.println("Hi Mr. "+name+"!");
                System.out.println("Insufficient Funds! You can not withdraw "+a+".");
            }
        }
        else
        {
            if(gender=='F')
            {
                System.out.println("Hi Ms. "+name+"!");
                System.out.println("Your Account Balance after withdrawl is "+(20000-a)+".");
            }
            else
            {
                System.out.println("Hi Mr. "+name+"!");
                System.out.println("Your Account Balance after withdrawl is "+(20000-a)+".");
            }
        }
    }
}

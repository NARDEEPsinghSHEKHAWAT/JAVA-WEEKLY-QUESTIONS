import java.util.*;


public class Solution {

    public static void main(String... args) {
        Scanner sc=new Scanner(System.in);
        int count=0,c=0;
        int n=0;
        String a=sc.next();
        String b=sc.next();
        if(a.length()!=b.length())
        {
            System.out.println("Not Similar");
            System.exit(0);
        }
        else if(a.length()<b.length())
        {
            n=b.length();
        }
        else
        {
            n=a.length();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    count++;
                }
            }
        }
        for(int i=0;i<(n/2);i++)
        {
            for(int j=(n-1);j>=(n/2);j--)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    c++;
                }
            }
        }
        if((count-c)==n)
        {
            System.out.println("Similar");
        }
        else
        {
            System.out.println("Not Similar");
        }
    }
}

import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int a = sc.nextInt();
      switch(a) {
         case 1:
            if(num % 2 == 0) {
               System.out.println("Yes");
            } else {
               System.out.println("NO");
            }
            break;
         case 2:
            if(num % 2 != 0) {
               System.out.println("Yes");
            } else {
               System.out.println("No");
            }
            break;
         case 3:
            int f= 0;
            for(int i = 2; i <= num / 2; ++i) {
               if(num % i == 0) {
                  f = 1;
                  break;
               }
            }
            if(f == 0) {
               System.out.println("Yes");
            } else {
               System.out.println("No");
            }
            break;
         case 4:
            int fac = 1;
            for(int i = 1; i <= num; ++i) {
               fac = fac * i;
            }
            System.out.println(fac);
            break;
        
      }
   }
}

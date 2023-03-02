import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSubjects = sc.nextInt();
        
        if (numSubjects <= 0) {
            System.out.println("Invalid");
        } else {
            int total = 0;
            for (int i = 1; i <= numSubjects; i++) {
                int marks = sc.nextInt();
                if (marks >= 0 && marks <= 100) {
                    total += marks;
                }
            }
            System.out.println(total);
        }
        
    }
}

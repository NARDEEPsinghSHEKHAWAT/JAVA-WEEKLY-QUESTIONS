import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        
        if (count > 7) {
            System.out.println("Invalid");
            return;
        }
        
        int totalMarks = 0;
        for (int i = 1; i <= count; i++) {
            int marks = input.nextInt();
            totalMarks += marks;
        }
        
        double percentage = ((double)totalMarks / (double)(count * 100)) * 100;
        char grade;
        
        if (percentage > 90) {
            grade = 'A';
        } else if (percentage >= 70 && percentage <= 89) {
            grade = 'A';
        } else if (percentage >= 60 && percentage <= 69) {
            grade = 'B';
        } else if (percentage >= 50 && percentage <= 59) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        
        System.out.println(grade);
    }
} 

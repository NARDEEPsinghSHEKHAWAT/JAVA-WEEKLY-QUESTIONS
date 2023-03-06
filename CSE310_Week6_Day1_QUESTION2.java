import java.util.*;

public class Solution {
   
    public static void countStrings(String[] arr) {
        int intCount = 0;
        int alphaCount = 0;
        for (String str : arr) {
            if (str.matches("\\d+")) {
                intCount++;
            } else if (str.matches("[a-zA-Z]+")) {
                alphaCount++;
            }
        }
        System.out.println(intCount);
        System.out.println(alphaCount);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid");
        } else {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            countStrings(arr);
        }
        sc.close();
    }} 

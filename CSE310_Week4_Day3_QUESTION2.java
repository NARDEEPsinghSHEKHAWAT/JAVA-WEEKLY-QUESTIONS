import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] deck1 = new int[n];

        for (int i = 0; i < n; i++) {

            deck1[i] = scanner.nextInt();

        }

        int[] deck2 = new int[n];

        for (int i = 0; i < n; i++) {

            deck2[i] = deck1[i];

        }

        for (int i = 0; i < n; i++) {

            System.out.print(deck1[i] + " ");

        }

        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.print(deck2[i] + " ");

        }

        System.out.println();

    }

}

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
    boolean[] visited = new boolean[n];
    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);
    visited[0] = true;

    while (!queue.isEmpty()) {
        int current = queue.poll();
        if (current + leap >= n || current == n - 1) {
            return true;
        }
        if (current - 1 >= 0 && !visited[current - 1] && game[current - 1] == 0) {
            visited[current - 1] = true;
            queue.add(current - 1);
        }
        if (!visited[current + 1] && game[current + 1] == 0) {
            visited[current + 1] = true;
            queue.add(current + 1);
        }
        if (!visited[current + leap] && game[current + leap] == 0) {
            visited[current + leap] = true;
            queue.add(current + leap);
        }
    }

    return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

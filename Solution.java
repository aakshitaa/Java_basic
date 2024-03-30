import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static int minRemoval(int[] dishes, int k) {
        int n = dishes.length;
        Arrays.sort(dishes);  // Sort dishes in ascending order

        int start = k; // Initialize start to k to avoid negative indices
        int end = 0, maxWindow = 0;

        while (end < n) {
            int diff = dishes[end] - (end >= k ? dishes[start - k] : dishes[0]); // Access first element for early iterations
            if (diff > k) {
                start++;
            } else {
                maxWindow = Math.max(maxWindow, end - start + 1);
            }
            end++;
        }

        return n - maxWindow;  // Minimum removal = total - balanced dishes
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] dishes = new int[n];
            for (int j = 0; j < n; j++) {
                dishes[j] = scanner.nextInt();
            }
            int minRemovalCount = minRemoval(dishes, k);
            System.out.println(minRemovalCount);
        }
    }
}

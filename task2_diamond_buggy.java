// Task 2: Buggy Diamond in Java (with AI allowed)
public class Task2DiamondBuggy {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
    }
}
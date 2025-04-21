// Task 2: Buggy Diamond in Java (with AI allowed)
// Final output should look like:

//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

public class Task2DiamondBuggy {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
        
        }
    }
}
// Task 1: Print Triangle in Java (Suggested Answer)
// Final output should look like:
// *
// **
// ***
// ****
// *****

public class Task1Triangle {
    public static void main(String[] args) {
        // Write your code below:
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) { // Loop through each row
            System.out.println("*".repeat(i)); // Print '*' i times
        }
    }
}
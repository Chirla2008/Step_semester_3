package string.class_problems;
public class NumberPyramid {

    public static void printNumberPyramid(int n) {
        // Outer loop controls the current row number
        for (int i = 1; i <= n; i++) {
            // Inner loop prints the row number 'i' exactly 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // Move to the next line after completing the row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test case from sample output
        printNumberPyramid(4);
    }
}

package string.class_problems;
public class CountUp {

    public static void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Test case from sample output
        printNumbersUpToN(5);
    }
}

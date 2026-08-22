package string.class_problems;
public class SkipMultiples {

    public static void printSkippingMultiplesOfThree() {
        for (int i = 1; i <= 20; i++) {
            // Check if current number is divisible by 3 with no remainder
            if (i % 3 == 0) {
                continue; // Skip the rest of the loop body and go to next iteration
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printSkippingMultiplesOfThree();
    }
}

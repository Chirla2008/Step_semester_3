package string.class_problems;
import java.util.Scanner;

public class Main {
    // Suggested method signature
    public static void checkVotingEligibility(int age) {
        // Boolean expression checking if age is 18 or older
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            checkVotingEligibility(age);
        }

        scanner.close();
    }
}

package string.class_problems;
public class GradeClassifier {

    public static void classifyWithAttendance(int marks, int attendance) {
        // Check if student meets both minimum attendance and passing marks criteria
        if (attendance < 75 || marks < 40) {
            System.out.println("Detained");
        } else if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }

    public static void main(String[] args) {
        // Test cases from sample output
        classifyWithAttendance(82, 80); // Output: Grade: B
        classifyWithAttendance(91, 60); // Output: Detained
    }
}

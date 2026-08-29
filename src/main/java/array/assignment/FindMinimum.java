package array.assignment;
import java.util.*;

public class FindMinimum {

    static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum is on the right side
                left = mid + 1;
            } else {
                // Minimum is on the left side including mid
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMin(nums);

        System.out.println("Minimum element: " + result);

        sc.close();
    }
}

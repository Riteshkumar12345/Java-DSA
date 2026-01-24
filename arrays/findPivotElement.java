import java.util.*;

public class findPivotElement {

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        // Find pivot index
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1; // No pivot index found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = pivotIndex(nums);

        if (result == -1) {
            System.out.println("Pivot Index not found");
        } else {
            System.out.println("Pivot Index = " + result);
        }

        sc.close();
    }
}

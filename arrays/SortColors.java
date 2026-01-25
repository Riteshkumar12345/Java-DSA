import java.util.*;

public class SortColors {

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else { 
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements (only 0, 1, 2):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sortColors(nums);

        System.out.println("Sorted Colors Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

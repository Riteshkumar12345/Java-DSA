import java.util.Scanner;

class trionic {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0) return false;

        int start = i;
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == start) return false;

        int secondStart = i;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == secondStart) return false;

        return i == n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        trionic sol = new trionic();
        boolean result = sol.isTrionic(nums);

        System.out.println("Is Trionic Array? " + result);
    }
}

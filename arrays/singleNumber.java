
public class singleNumber {

    public static int singleNumber(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            ans ^= num; // XOR operation
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        System.out.println("Single Number: " + singleNumber(nums));
    }
}

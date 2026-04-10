import java.util.*;

public class productExceptitself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // array input
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        // function call
        int[] result = productExceptSelf(nums);

        // output
        System.out.println("Output array:");
        for(int val : result){
            System.out.print(val + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int proL = 1;
        int proR = 1;
        int[] res = new int[nums.length];

        // right product
        for(int i = nums.length - 1; i >= 0; i--){
            res[i] = proR;
            proR = proR * nums[i];
        }

        // left product
        for(int i = 0; i < nums.length; i++){
            res[i] = res[i] * proL;
            proL = proL * nums[i];
        }

        return res;
    }
}
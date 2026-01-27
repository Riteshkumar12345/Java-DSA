import java.util.*;

public class twoSum1 {
    
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{-1, -1}; // if no solution
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        
        int[] result = twoSum(nums, target);
        
        System.out.println("Output Indexes: " + Arrays.toString(result));
    }
}

import java.util.*;

public class twoSumSecond {
    
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while(left < right){
            int sum = numbers[left] + numbers[right];
            
            if(sum == target){
                return new int[]{left + 1, right + 1}; // 1-based index
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Enter sorted array elements:");
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        
        int[] result = twoSum(numbers, target);
        
        System.out.println("Output Indexes: " + Arrays.toString(result));
    }
}

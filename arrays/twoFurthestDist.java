import java.util.*;

public class twoFurthestDist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] colors = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            colors[i] = sc.nextInt();
        }

        int result = maxDistance(colors);

        System.out.println("Maximum Distance: " + result);
    }

    public static int maxDistance(int[] colors) {
        int maxDist = 0;
        int n = colors.length;
        for(int j = n-1; j >= 0; j--){
            if(colors[j] != colors[0]){
                maxDist = j;
                break;
            }
        }
        for(int i = 0; i < n; i++){
            if(colors[i] != colors[n-1]){
                maxDist = Math.max(maxDist, n-1-i);
                break;
            }
        }

        return maxDist;
    }
}
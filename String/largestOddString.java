public class largestOddString {

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String num = "52";

        String result = largestOddNumber(num);
        System.out.println("Largest Odd Number: " + result);
    }
}

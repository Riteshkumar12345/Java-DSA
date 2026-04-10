import java.util.Scanner;
public class rrr {
    public static String encrypt(String text, int key) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += (char) (((ch - 'A') * key) % 26 + 'A');
            } 
            else if (Character.isLowerCase(ch)) {
                result += (char) (((ch - 'a') * key) % 26 + 'a');
            } 
            else {
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = sc.nextLine();
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        String encrypted = encrypt(message, key);
        System.out.println("Encrypted: " + encrypted);
    }
}
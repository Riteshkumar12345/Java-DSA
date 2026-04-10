import java.util.Scanner;

public class rr {
    public static int modInverse(int key) {
        for (int i = 1; i < 26; i++) {
            if ((key * i) % 26 == 1)
                return i;
        }
        return -1; 
    }
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
    public static String decrypt(String text, int key) {
        int inverse = modInverse(key);
        if (inverse == -1) {
            return "Key has no modular inverse!";
        }

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                result += (char) (((ch - 'A') * inverse) % 26 + 'A');
            } 
            else if (Character.isLowerCase(ch)) {
                result += (char) (((ch - 'a') * inverse) % 26 + 'a');
            } 
            else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = sc.nextLine();

        System.out.print("Enter key (coprime with 26): ");
        int key = sc.nextInt();

        String encrypted = encrypt(message, key);
        String decrypted = decrypt(encrypted, key);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
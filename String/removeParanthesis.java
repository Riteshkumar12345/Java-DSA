import java.util.*;

public class removeParanthesis {
    
    public static String removeOuterParentheses(String s) {
        StringBuilder st = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(!stack.isEmpty()){
                    st.append(ch);
                }
                stack.push(ch);
            } else {
                stack.pop();
                if(!stack.isEmpty()){
                    st.append(ch);
                }
            }
        }
        return st.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();
        
        String result = removeOuterParentheses(s);
        
        System.out.println("Output: " + result);
    }
}

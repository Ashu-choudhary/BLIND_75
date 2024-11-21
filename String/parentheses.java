package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class parentheses {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(valid_parentheses(s));



    }

    public static boolean valid_parentheses(String s) {

        Stack<Character> st = new Stack<Character>();

        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}', '{');

        for(char ch : s.toCharArray()){
            if (map.containsValue(ch)) {
                st.push(ch);
            } else if(map.containsKey(ch)) {
                if(st.isEmpty() || map.get(ch) != st.pop()){
                    return false;
                }
            }
        }
        return true;
    }
}

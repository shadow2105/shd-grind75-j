package string;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidPalindrome {

    // Time Complexity: O(n) ; Space Complexity: O(n)
    // LeetCode - Runtime: 9 ms ; Memory : 44.9 MB
    public static boolean solution(String s) {
        s = s.toLowerCase();
        StringBuilder alNumString = new StringBuilder();
        StringBuilder alNumStringReverse = new StringBuilder();

        Deque<Character> stack = new ArrayDeque<>();

        for(char c: s.toCharArray()) {
            if(c >= '0' && c <= '9' || c >= 'a' && c <= 'z') {
                alNumString.append(c);
                stack.push(c);
            }
        }
        while(!stack.isEmpty()) {
            alNumStringReverse.append(stack.pop());
        }
        return alNumString.toString().equals(alNumStringReverse.toString());
    }

    // Left Right Pointer - Time Complexity: O(n) ; Space Complexity: O(1)
    // LeetCode - Runtime: 3 ms ; Memory : 42.5 MB
    public static boolean solutionLFPointer(String s) {
        int left = 0, right = s.length()-1;

        s = s.toLowerCase();
        while(left < right) {
            char cl = s.charAt(left);
            char cr = s.charAt(right);
            if (!(cl >= '0' && cl <= '9' || cl >= 'a' && cl <= 'z')) {
                left++;
            }
            else if (!(cr >= '0' && cr <= '9' || cr >= 'a' && cr <= 'z')) {
                right--;
            }
            else {
                if(cl != cr) {
                    return false;
                }
                else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
}

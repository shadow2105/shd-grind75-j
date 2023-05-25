package stack;

import java.util.*;

public class ValidParentheses {

    // Time Complexity: O(n) ; Space Complexity: O(N)
    // LeetCode - Runtime: 3 ms ; Memory : 40.8 MB
    public static boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Set<Character> openBrackets = new HashSet<>(Arrays.asList('(', '{', '['));

        if(s.length()%2 != 0 || !openBrackets.contains(s.charAt(0))) {
            return false;
        }

        for(Character bracket: s.toCharArray()) {
            if(stack.isEmpty() && !openBrackets.contains(bracket)) {
                return false;
            }
            else if(openBrackets.contains(bracket)) {
                stack.push(bracket);
            }
            else {
                if((stack.peek() == '(' && bracket == ')') || (stack.peek() == '{' && bracket == '}') || (stack.peek() == '[' && bracket == ']')) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // Time Complexity: O(n) ; Space Complexity: O(N)
    // LeetCode - Runtime: 2 ms ; Memory : 40.7 MB
    public static boolean solutionMap(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Set<Character> openBrackets = new HashSet<>(Arrays.asList('(', '{', '['));
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('{', '}');
        bracketMap.put('[', ']');

        for(Character bracket: s.toCharArray()) {
            if(openBrackets.contains((bracket))) {
                stack.push(bracket);
            }
            else {
                if(stack.isEmpty() || bracketMap.get(stack.peek()) != bracket) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}

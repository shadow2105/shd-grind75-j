package string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // Breadth First Search (Iteration) - Time Complexity: O(n) ; Space Complexity: O(k) ,
    // Array random access is faster (that is when indices are known) than Hashmap,
    // Hashmap is implemented using an array of Linked List and also involves hashing operation overhead;
    // LeetCode - Runtime: 5 ms ; Memory : 41.9 MB
    public static boolean solutionArray(String s, String t) {
        if(s.length() != t.length()) { return false; }

        int[] letterFrequencyArr = new int[26];

        for(int i=0; i<s.length(); i++) {
            letterFrequencyArr[s.charAt(i) - 'a']++;
            letterFrequencyArr[t.charAt(i) - 'a']--;
        }

        for(int count: letterFrequencyArr) {
            if(count != 0) { return false; }
        }

        return true;
    }

    // Depth First Search (Recursion) - Time Complexity: O(n) ; Space Complexity: O(k) ,
    // LeetCode - Runtime: 16 ms ; Memory : 43.8 MB
    public static boolean solutionMap(String s, String t) {
        if(s.length() != t.length()) { return false; }

        Map<Character, Integer> letterFrequency = new HashMap<>();
        for(char l: s.toCharArray()) {
            if(!letterFrequency.containsKey(l)) {
                letterFrequency.put(l, 1);
            }
            else {
                letterFrequency.put(l, letterFrequency.get(l)+1);
            }
        }

        for(char l: t.toCharArray()) {
            if(letterFrequency.get(l) == null || letterFrequency.get(l) == 0) {
                return false;
            }
            letterFrequency.put(l, letterFrequency.get(l)-1);
        }

        return true;
    }
}

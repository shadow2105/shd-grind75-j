package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Brute Force - Time Complexity: O(n^2) ; Space Complexity: O(1)
    public static int[] solution(int[] nums, int target) {
        int[] out = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    out[0] = i;
                    out[1] = j;
                    break;
                }
            }
        }
        return out;
    }

    // Hash Table - Time Complexity: O(n) ; Space Complexity: O(n)
    public static int[] solutionMap(int[] nums, int target) {
        int diff;
        Map<Integer, Integer> hmap = new HashMap<>();
        int[] out = new int[2];

        for(int i=0; i<nums.length; i++) {
            diff = target - nums[i];

            if(hmap.containsKey(diff)) {
                out[0] = hmap.get(diff);
                out[1] = i;
                break;
            }
            hmap.put(nums[i], i);
        }
        return out;
    }
}

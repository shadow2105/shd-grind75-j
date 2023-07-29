package binarysearch;

public class BinarySearch {

    // Time Complexity: O(log n) ; Space Complexity: O(1) ,
    // LeetCode - Runtime: 0 ms ; Memory : 45 MB
    public static int solution(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        int midIndex;

        while(startIndex <= endIndex) {
            midIndex = (startIndex + endIndex) / 2;
            if(nums[midIndex] == target) {
                return midIndex;
            }
            else if(nums[midIndex] < target) {
                startIndex = midIndex + 1;
            }
            else {
                endIndex = midIndex - 1;
            }
        }

        return -1;
    }
}

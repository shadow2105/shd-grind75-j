package array;

public class BestTimeToBuySellStock {

    // Time Complexity: O(n) ; Space Complexity: O(1)
    // LeetCode - Runtime: 2 ms ; Memory : 61 MB
    public static int solution(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        int i=1;
        while(i<prices.length) {
            // prices[i] is the (new) Buy Price
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            // prices[i] is the Sell Price
            else if(prices[i] > buyPrice) {
                maxProfit = Math.max(prices[i] - buyPrice, maxProfit);
            }
            i++;
        }
        return maxProfit;
    }

    // Left Right Pointer - Time Complexity: O(n) ; Space Complexity: O(1)
    // LeetCode - Runtime: 1 ms ; Memory : 61 MB
    public static int solutionLFPointer(int[] prices) {
        // Left Pointer = Buy Price ; Right Pointer = Sell Price
        int left = 0, right = 1;
        int maxProfit = 0;

        while(right < prices.length) {
            if(prices[left] < prices[right]) {
                maxProfit = Math.max(prices[right] - prices[left], maxProfit);
            }
            else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n = a.length;
        int left = 0, right = 0;
        long sum = 0;
        int maxLen = 0;

        while (right < n) {
            // Rule 1: Expand
            sum += a[right];

            // Rule 2: Shrink if we overshot the target K
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // Rule 3: Check for target
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move Right forward
            right++;
        }
        return maxLen;
    }
}

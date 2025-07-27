import java.util.HashMap;

class LongestSubArraySum {

    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: If sum is 0, update maxLen from start to i
            if (sum == 0) {
                maxLen = i + 1;
            }

            // Case 2: If sum has been seen before, calculate length
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                int len = i - prevIndex;
                maxLen = Math.max(maxLen, len);
            } else {
                // Case 3: First time seeing this sum
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -2, 4, -4 };
        int result = lengthOfLongestSubsetWithZeroSum(arr);
        System.out.println("Length of longest subarray with zero sum: " + result);

        int[] arr2 = { 2, -2, 0, -2, 2 };
        int result2 = lengthOfLongestSubsetWithZeroSum(arr2);
        System.out.println("Length of longest subarray with zero sum: " + result2);
    }
}

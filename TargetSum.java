package DP;

class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        // Calculate the total sum of the numbers in the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        // If the target is out of range, there's no way to achieve it
        if (target > sum || target < -sum) {
            return 0;
        }
        
        // The offset is used to shift the range from [-sum, sum] to [0, 2 * sum]
        int offset = sum;
        
        // Create a 2D array to store the number of ways to achieve each target sum
        // Rows represent the numbers in the array, columns represent the possible sums
        // dp[i][j] represents the number of ways to achieve the sum j using the first i numbers
        int[][] dp = new int[nums.length + 1][2 * sum + 1];
        
        // Set the initial state
        dp[0][offset] = 1;
        
        // Iterate over the numbers in the array and calculate the number of ways for each sum
        for (int i = 1; i <= nums.length; i++) {
            int num = nums[i - 1];
            
            // Calculate the number of ways to achieve each possible sum
            for (int j = -sum; j <= sum; j++) {
                if (dp[i - 1][j + offset] > 0) {
                    // If there are ways to achieve the current sum, update the counts
                    dp[i][j + num + offset] += dp[i - 1][j + offset];
                    dp[i][j - num + offset] += dp[i - 1][j + offset];
                }
            }
        }
        
        // Return the number of ways to achieve the target sum
        return dp[nums.length][target + offset];
    }



    public static void main(String[] args) {
        TargetSum solution = new TargetSum();
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        int ways = solution.findTargetSumWays(nums, target);
        System.out.println("Number of ways to achieve the target sum: " + ways);
    }
}

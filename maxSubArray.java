public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0]; // Initialize maxSoFar with the first element
        int currentMax = nums[0]; // Initialize currentMax with the first element

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]); // Update currentMax
            maxSoFar = Math.max(maxSoFar, currentMax); // Update maxSoFar
        }

        return maxSoFar; // Return the maximum subarray sum
    }

    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = solution.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result); // Output: 6
    }
}

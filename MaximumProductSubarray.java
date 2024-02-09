public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = maxProduct;

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max(num, maxProduct * num);
            minProduct = Math.min(num, minProduct * num);
            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum product of subarrays: " + maxProduct(nums)); // Output: 6
    }
}

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            max = Math.max(nums[i], max);
            int sum = nums[i];
            for(int j = i+1; j < nums.length; j++ ){
                sum+=nums[j];
                max = Math.max(sum, max);
            }
        }
        System.out.printf(String.valueOf(max));
        return max;
    }
}

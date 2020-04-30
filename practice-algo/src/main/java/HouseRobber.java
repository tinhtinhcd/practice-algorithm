public class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);

        int current = 0;
        int prv = 0;

        for (int i = 0; i < nums.length; i ++){
            int max = Math.max(current, nums[i] + prv);
            prv = current;
            current = max;
        }
        System.out.printf(String.valueOf(current));
        return current;
    }

}

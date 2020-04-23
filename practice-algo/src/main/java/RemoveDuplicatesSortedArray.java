import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

    public void remove(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length ; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        int[] rs = new int[j+1];
        System.arraycopy(nums, 0, rs, 0, j+1);
        System.out.printf(Arrays.toString(rs));
    }

    // using java 8 stream
    public void removeV2(int[] nums){
        nums = Arrays.stream(nums).distinct().toArray();
        System.out.printf(Arrays.toString(nums));
    }
}

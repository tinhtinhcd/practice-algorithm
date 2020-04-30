import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0)
                zero++;
            if(nums[i]==1)
                one++;
            if(nums[i]!=2)
                nums[i] = 2;
        }
        one += zero;
        for(int i = 0; i < nums.length; i++){
            if(i < zero)
                nums[i] = 0;
            if(i >= zero && i < one)
                nums[i] = 1;
        }

        System.out.printf(Arrays.toString(nums));
    }
}

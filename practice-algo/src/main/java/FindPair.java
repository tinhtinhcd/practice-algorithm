import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPair {

    public List<int[]> findPairMathNum(int[] nums, int k) {

        List<int[]> rs = new ArrayList<>();
        if (nums.length < 2)
            return rs;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length-1; i++){
            int sumK = nums[i] + k;
            if(nums[i] == nums[i+1])
                continue;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == sumK){
                    rs.add(new int[]{nums[i], nums[j]});
                }
            }
        }

        return rs;
    }
}

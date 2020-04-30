import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> rs = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++){
            int sum = 0 - nums[i];
            int s = i + 1;
            int e = nums.length -1;
            while (s < e){
                if(nums[s] + nums[e] == sum ){
                    int start = nums[s];
                    int end = nums[e];
                    List<Integer> sub = new ArrayList<Integer>(){{add(0-sum);}};
                    sub.add(start);
                    sub.add(end);
                    rs.add(sub);
                }
                s++;
                e--;
            }
        }

        return rs.stream().distinct().collect(Collectors.toList());
    }
}

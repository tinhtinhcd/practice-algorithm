import java.util.HashMap;

public class CheckDuplicate {

    public void containsDuplicate(int[] nums) {
        System.out.printf(String.valueOf(check(nums)));
    }

    private boolean check(int[] nums){
        HashMap check = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(check.get(nums[i]) != null)
                return true;
            else
                check.put(nums[i], nums[i]);
        }
        return false;
    }
}

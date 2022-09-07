public class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = (end-start)/2;

        while(mid != end && mid!=start){

            if(nums[mid] == target)
                return mid;

            else {
                if(nums[mid] > target)
                    end = mid;
                else
                    start = mid;
                mid = (end-start)/2 + start;
            }

        }

        if(mid == start && nums[mid] == target)
            return mid;
        else if(++mid < nums.length && nums[mid] == target)
            return  mid;
        else return -1;
    }
}

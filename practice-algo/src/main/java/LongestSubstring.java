import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        int end = 0;
        int max = 0;
        List<Character> chars = new ArrayList<>();
        int n = s.length();

        while (end < n){
            if(!chars.contains(s.charAt(end))){
                chars.add(s.charAt(end++));
                max = Math.max(max, chars.size());
            }else{
                chars.remove(0);
            }
        }

        return max;
    }
}

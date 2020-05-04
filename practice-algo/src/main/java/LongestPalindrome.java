import java.util.Arrays;
import java.util.List;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int n = s.length();
        int curr = 0;
        String maxStr = "";
        while (curr < n) {
            int left = expand(s, curr, curr);
            int right = expand(s, curr, curr + 1);
            int max = Math.max(left, right);
            if (max > maxStr.length()) {
                maxStr = s.substring(curr - (max - 1) / 2, curr + max / 2 + 1);
            }
            curr++;
        }
        return maxStr;
    }

    private int expand(String s, int start, int end) {
        int n = s.length();
        while (end < n && start >= 0 && s.charAt(end) == s.charAt(start)) {
            start--;
            end++;
        }
        return end - start - 1;
    }


    public boolean isAnagram(String s, String t) {
        List<String> lst = Arrays.asList(t.split(""));
        for(String str: lst){
            if(s.contains(str))
                lst.remove(str);
        }
        return lst.size() == 0;
    }
}

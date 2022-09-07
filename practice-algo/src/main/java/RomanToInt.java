import java.util.*;
import java.util.stream.Collectors;

public class RomanToInt {

    public int romanToInt(String s) {

        HashMap<String, Integer> map = new HashMap();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String[] slp = s.trim().split("");
        long nonValidChar = Arrays.stream(slp)
                .filter(n -> map.get(n) == null).count();
        if (nonValidChar > 0)
            return 0;

        List<String> reverse = Arrays.asList(slp);
        Collections.reverse(reverse);
        List<Integer> nums = reverse.stream().map(a -> map.get(a)).collect(Collectors.toList());
        return nums.stream().reduce(0, (a, b) ->(a/b>=5)?a-b:a+b);
    }
}

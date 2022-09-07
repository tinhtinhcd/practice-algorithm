import java.util.function.BiFunction;
import java.util.function.Predicate;

public class StringToInt {

    public int convert(String s) {
        int rs = 0;
        s = s.trim();

        if (s.length() < 1)
            return rs;

        Predicate<Integer> isInt = c -> c <= 57 && c >= 48;
        if (!isInt.test((int) s.charAt(0)) && s.charAt(0) != '-' && s.charAt(0) != '+')
            return 0;

        int m = s.charAt(0) == '-'?-1:1;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            s = s.substring(1);
        }

        BiFunction<String, Integer, Integer> getRs = (r, start) -> {
            double d = r.chars().takeWhile(isInt::test)
                    .mapToDouble(j -> Double.parseDouble(Character.toString((char) j)))
                    .reduce(0, (a, b) -> Math.abs(a * 10 + b)) * start;
            return (d < Integer.MIN_VALUE) ? Integer.MIN_VALUE : (d > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) d);
        };
        rs = getRs.apply(s, m);

        return rs;
    }
}

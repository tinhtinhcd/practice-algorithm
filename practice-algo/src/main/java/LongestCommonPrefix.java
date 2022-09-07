import java.util.Arrays;
import java.util.stream.IntStream;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        return Arrays.stream(strs).reduce((a, b) -> {
            if ("".equals(a) || "".equals(b))
                return "";
            StringBuilder builder = new StringBuilder();

            int min = Math.min(a.length(), b.length());
            IntStream.range(0, min).takeWhile(i -> a.charAt(i) == b.charAt(i)).forEach(i -> {
                if (a.charAt(i) == b.charAt(i))
                    builder.append(a.charAt(i));
            });
            return builder.toString();
        }).get();

    }
}

public class PatternMatching {
    int binaryPatternMatching(String pattern, String s) {
        if(s.length()<pattern.length())
            return 0;
        s = s.replaceAll("[aeiouy]", "0");
        s = s.replaceAll("[^0]", "1");

        int count = 0;
        while(s.length() >= pattern.length()){
            if(s.startsWith(pattern))
                count++;
            s = s.substring(1);
        }
        return count;
    }
}

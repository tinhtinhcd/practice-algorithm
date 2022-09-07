import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {

        LongestCommonPrefix common  = new LongestCommonPrefix();
        assertEquals("fl", common.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", common.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("c", common.longestCommonPrefix(new String[]{"cir","car"}));
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntTest {

    @Test
    void romanToInt() {
        RomanToInt roman = new RomanToInt();
        assertEquals(3, roman.romanToInt("III"));
        assertEquals(58, roman.romanToInt("LVIII"));
        assertEquals(1994, roman.romanToInt("MCMXCIV"));
    }
}
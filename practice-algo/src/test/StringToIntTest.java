import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntTest {


    @Test
    void convert() {
        StringToInt test = new StringToInt();
        Assert.assertEquals(0, test.convert("words and 987"));
        Assert.assertEquals(-42, test.convert("     -42"));
        Assert.assertEquals(-2147483648, test.convert("-91283472332"));
        Assert.assertEquals(3, test.convert("3.14159"));
    }
}
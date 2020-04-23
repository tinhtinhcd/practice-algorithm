import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int memory = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + memory) % 10;
            memory = digits[i] == 0 ? 1 : 0;
            if (memory == 0)
                break;
        }
        if (memory == 1) {
            int[] rs = new int[digits.length + 1];
            rs[0] = 1;
            System.arraycopy(digits, 0, rs, 1, digits.length);
            digits = rs;
        }

        System.out.printf(Arrays.toString(digits));
        return digits;
    }
}

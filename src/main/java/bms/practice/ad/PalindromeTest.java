package bms.practice.ad;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PalindromeTest {


    @Test
    public void isPalindrome() {
        int x = 10000;
        List<Integer> digits = new ArrayList<>();
        while (x > 0) {
            int y = x % 10;
            x /= 10;
            digits.add(y);
        }
        for (int i = 0; i < digits.size() / 2; i++) {
            if (digits.get(i) == digits.get(digits.size() - i - 1)) {
                continue;
            } else
                break;
        }

    }
}

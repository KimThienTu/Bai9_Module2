package BT_ChuongTrinhTinhKetQua;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    public void testTranslate(){
        // Test case 1.
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(15));

        // Test case 2.
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(30));

        // Test case 3.
        assertEquals("Fizz", FizzBuzzTranslate.translate(9));

        // Test case 4.
        assertEquals("Buzz", FizzBuzzTranslate.translate(10));

        // Test case 5.
        assertEquals("11", FizzBuzzTranslate.translate(11));

        // Test case 6.
        assertEquals("14", FizzBuzzTranslate.translate(14));
    }

    public void testTranslateToText(){
        // Test case 1
        assertEquals("FizzBuzz", FizzBuzzTranslate.translateToText(15));

        // Test case 2
        assertEquals("FizzBuzz", FizzBuzzTranslate.translateToText(30));

        // Test case 3
        assertEquals("Fizz", FizzBuzzTranslate.translateToText(9));

        // Test case 4
        assertEquals("Buzz", FizzBuzzTranslate.translateToText(10));

        // Test case 5
        assertEquals("mười một", FizzBuzzTranslate.translateToText(11));

        // Test case 6
        assertEquals("mười bốn", FizzBuzzTranslate.translateToText(14));

        // Test case 7
        assertEquals("mười sáu", FizzBuzzTranslate.translateToText(16));

        // Test case 8
        assertEquals("hai mươi", FizzBuzzTranslate.translateToText(20));

        // Test case 9
        assertEquals("hai mươi một", FizzBuzzTranslate.translateToText(21));

        // Test case 10
        assertEquals("ba mươi", FizzBuzzTranslate.translateToText(30));

        // Test case 11
        assertEquals("ba mươi một", FizzBuzzTranslate.translateToText(31));

        // Test case 12
        assertEquals("bảy mươi hai", FizzBuzzTranslate.translateToText(72));

        // Test case 13
        assertEquals("tám mươi chín", FizzBuzzTranslate.translateToText(89));

        // Test case 14
        assertEquals("chín mươi một", FizzBuzzTranslate.translateToText(91));

        // Test case 15
        assertEquals("chín mươi chín", FizzBuzzTranslate.translateToText(99));

    }
}

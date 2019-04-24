package tests;

import caesarapplication.Caesar;
import caesarapplication.TextAndKey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CaesarTest {
    Caesar caesar = new Caesar();
    TextAndKey textAndKey = new TextAndKey("hello", 1);

    @ParameterizedTest
    @CsvSource({
            "hello,ifmmp"
    })
    void getCipherText(String actual, String expected) {
        actual = caesar.getCipherText(textAndKey);
        Assertions.assertEquals(expected, actual);
    }
}
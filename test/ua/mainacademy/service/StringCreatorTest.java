package ua.mainacademy.service;

import org.junit.jupiter.api.Test;
import ua.mainacademy.Application;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCreatorTest {

    @Test
    void multiplyStringCreator() {
        final Logger LOGGER=Logger.getLogger(Application.class.getName());
        long one = 2132452567;
        long two = 248267867 ;
        String result = StringCreator.multiplyStringCreator(one,two).toString();
        String result1 = "\n"+"        2132452567\n" +
                "         248267867\n" +
                "         ---------\n" +
                "       14927167969\n" +
                "      12794715402 \n" +
                "     17059620536  \n" +
                "    14927167969   \n" +
                "   12794715402    \n" +
                "   4264905134     \n" +
                " 17059620536      \n" +
                " 8529810268       \n" +
                "4264905134        \n" +
                "------------------\n" +
                "529419450287764589";
        assertEquals(result1,result);
    }

    @Test
    void symbolMultiply() {
        String result = StringCreator.symbolMultiply(10,'2');
        String result1 = "2222222222";
        assertEquals(result1,result);
    }
}
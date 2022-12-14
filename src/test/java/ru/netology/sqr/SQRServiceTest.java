package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "0,226,230",
            "1,90,120",
            "0,80,99",
            "0,9802,9900",
            "1,9800,9802"
    })
    public void shouldCountNumSqrs(int expected, int lowerRange, int upperRange) {
        SQRService service = new SQRService();
        int actual = service.countSqrNum(lowerRange, upperRange);

        Assertions.assertEquals(expected, actual);
    }
}

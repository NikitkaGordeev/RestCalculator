package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceCalcTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Rest.csv")
    public void testRestServiceCalc(int income, int expenses, int threshold, int expected) {
        RestServiceCalc service = new RestServiceCalc();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
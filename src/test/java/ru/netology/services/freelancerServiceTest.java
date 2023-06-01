package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class freelancerServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "10_000,3_000,20_000,3",
//            "100_000,60_000,150_000,2"
//    })
    @CsvFileSource (files="src/test/resources/freelancer.csv")
    public void testCountRestMonth(int income, int expenses, int threshold, int expected) {
        freelancerService service = new freelancerService();

        int actual = service.calculate(income, expenses, threshold);
       // int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testCountRestMonth2() {
//        freelancerService service = new freelancerService();
//
//        int actual = service.calculate(100_000, 60_000, 150_000);
//        int expected = 2;
//
//        Assertions.assertEquals(expected, actual);
//    }

}
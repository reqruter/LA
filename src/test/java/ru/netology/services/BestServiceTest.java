package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestServiceTest {
    @Test
    public void calculateTest1() {
        BestService service = new BestService();
        int actual = service.calculate (income:10000,expenses: 3000,threshold: 20000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateTest2() {
        BestService service = new BestService();
        int actual = service.calculate(income:100_000, expenses:60_000, threshold:150_000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}
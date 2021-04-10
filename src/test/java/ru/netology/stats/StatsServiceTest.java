package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    //long[] purchases = {18, 1, 19, 15, 16, 14, 15, 12, 9, 16, 17, 11};
    StatsService service = new StatsService();

    @Test
    void shouldCalculatesumStat() {

        long sum = service.sumStat(purchases);
        long expected = 180;
        assertEquals(sum, expected);
    }

    @Test
    void shouldCalculateAvSumStat() {
        long averSum = service.avSumStat(purchases);
        long expected = 15;
        assertEquals(averSum, expected);
    }

    @Test
    void shouldCalculateMaxStat() {
        long maxNumber = service.maxStat(purchases);
        long expected = 5;
        assertEquals(maxNumber, expected);
    }

    @Test
    void shouldCalculateMinStat() {
        long minNumber = service.minStat(purchases);
        long expected = 8;
        assertEquals(minNumber, expected);

    }

    @Test
    void shouldCalculateAmountBelowAverage() {
        long averSum = 15;
        long amountMin = service.amountBelowAverage(purchases, averSum);
        long expected = 5;
        assertEquals(amountMin, expected);
    }

    @Test
    void shouldCalculateAmountAboveAverage() {
        long averSum = 15;
        long amountMax = service.amountBelowAverage(purchases, averSum);
        long expected = 5;
        assertEquals(amountMax, expected);

    }
}
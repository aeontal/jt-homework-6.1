package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    //long[] purchases = {18, 1, 19, 15, 16, 14, 15, 12, 9, 16, 17, 11};
    StatsService service=new StatsService();

    @Test
    void shouldCalculatesumStat() {

        long sum=service.sumStat(purchases);
        long expected =180;
        assertEquals(sum,expected);
    }

    @Test
   void shouldCalculateAvSumStat() {
    long aver_sum=service.avSumStat(purchases);
    long expected =15;
    assertEquals(aver_sum,expected);
   }

   @Test
    void shouldCalculateMaxStat() {
        long max_number=service.maxStat(purchases);
    long expected =5;
    assertEquals(max_number,expected);
    }

    @Test
    void shouldCalculateMinStat() {
        long min_number=service.minStat(purchases);
        long expected =8;
        assertEquals(min_number,expected);

    }

   @Test
   void shouldCalculateAmountBelowAverage() {
   long aver_sum=15;
   long amount_min=service.amountBelowAverage(purchases,aver_sum);
   long expected =5;
   assertEquals(amount_min,expected);
    }

    @Test
    void shouldCalculateAmountAboveAverage() {
        long aver_sum=15;
        long amount_max=service.amountBelowAverage(purchases,aver_sum);
        long expected =5;
        assertEquals(amount_max,expected);

   }
}
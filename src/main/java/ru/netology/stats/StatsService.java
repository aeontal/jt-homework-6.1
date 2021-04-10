package ru.netology.stats;


public class StatsService {

    public static void main(String[] args) {
        //long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long[] purchases = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        long sum = sumStat(purchases);
        long averSum = avSumStat(purchases);
        long maxNumber = maxStat(purchases);
        long minNumber = minStat(purchases);
        long amountMin = amountBelowAverage(purchases, averSum);
        long amountMax = amountAboveAverage(purchases, averSum);


        System.out.println(sum);
        System.out.println(averSum);
        System.out.println(maxNumber);
        System.out.println(minNumber);
        System.out.println(amountMin);
        System.out.println(amountMax);

    }

    public static long sumStat(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public static long avSumStat(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long averSum = sum / purchases.length;
        return averSum;
    }

    public static long maxStat(long[] purchases) {
        long currentMax = purchases[0];
        int maxNumber = 0;
        for (int i = 0; i < purchases.length; ++i) {
            if (purchases[i] > currentMax) {
                currentMax = purchases[i];
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public static long minStat(long[] purchases) {
        long currentMin = purchases[0];
        int minNumber = 0;
        for (int i = 0; i < purchases.length; ++i) {
            if (purchases[i] < currentMin) {
                currentMin = purchases[i];
                minNumber = i;
            }
        }
        return minNumber;
    }

    public static long amountBelowAverage(long[] purchases, long averSum) {
        long amountMin = 0;
        for (int i = 0; i < purchases.length; ++i) {
            if (averSum < purchases[i]) {
                amountMin++;
            }
        }
        return amountMin;

    }

    public static long amountAboveAverage(long[] purchases, long averSum) {
        long amountMax = 0;
        for (int i = 0; i < purchases.length; ++i) {
            if (averSum > purchases[i]) {
                amountMax++;
            }
        }
        return amountMax;
    }
}

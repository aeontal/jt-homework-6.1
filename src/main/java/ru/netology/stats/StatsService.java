package ru.netology.stats;


public class StatsService {

    public static void main(String[] args) {
        //long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long[] purchases = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        long sum = sumStat(purchases);
        long aver_sum = avSumStat(purchases);
        long max_number = maxStat(purchases);
        long min_number = minStat(purchases);
        long amount_min = amountBelowAverage(purchases, aver_sum);
        long amount_max = amountAboveAverage(purchases, aver_sum);


        System.out.println(sum);
        System.out.println(aver_sum);
        System.out.println(max_number);
        System.out.println(min_number);
        System.out.println(amount_min);
        System.out.println(amount_max);

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
        long aver_sum = sum / purchases.length;
        return aver_sum;
    }

    public static long maxStat(long[] purchases) {
        long currentMax = purchases[0];
        int max_number = 0;
        for (int i = 0; i < purchases.length; ++i) {
            if (purchases[i] > currentMax) {
                currentMax = purchases[i];
                max_number = i;
            }
        }
        return max_number;
    }

    public static long minStat(long[] purchases) {
        long currentMin = purchases[0];
        int min_number = 0;
        for (int i = 0; i < purchases.length; ++i) {
            if (purchases[i] < currentMin) {
                currentMin = purchases[i];
                min_number = i;
            }
        }
        return min_number;
    }

    public static long amountBelowAverage(long[] purchases, long aver_sum) {
        long amount_min = 0;
        for (int i = 0; i < purchases.length; ++i) {
            if (aver_sum < purchases[i]) {
                amount_min++;
            }
        }
        return amount_min;

    }

    public static long amountAboveAverage(long[] purchases, long aver_sum) {
        long amount_max = 0;
        for (int i = 0; i < purchases.length; ++i) {
            if (aver_sum > purchases[i]) {
                amount_max++;
            }
        }
        return amount_max;
    }
}

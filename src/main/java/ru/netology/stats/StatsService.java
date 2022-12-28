package ru.netology.stats;

public class StatsService {
    public long calculateSalesSum(long[] sales) {
        long sum = 0;
        for (long salesPerMonth : sales) {
            sum += salesPerMonth;
        }
        return sum;
    }

    public long calculateAverageSalesPerMonth(long[] sales) {
        return calculateSalesSum(sales) / sales.length;
    }

    public int getMaxSalesMonth(long[] sales) {
        int maxSalesMonthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[maxSalesMonthNumber] <= sales[i]) {
                maxSalesMonthNumber = i;
            }
        }
        return maxSalesMonthNumber + 1;
    }

    public int getMinSalesMonth(long[] sales) {
        int minSalesMonthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[minSalesMonthNumber] > sales[i]) {
                minSalesMonthNumber = i;
            }
        }
        return minSalesMonthNumber + 1;
    }

    public int getMonthsNumberWithSalesBelowAverage(long[] sales) {
        int monthCounter = 0;
        long averageSumPerMonth = calculateAverageSalesPerMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumPerMonth) {
                monthCounter++;
            }
        }
        return monthCounter;
    }

    public int getMonthsNumberWithSalesAboveAverage(long[] sales) {
        int monthCounter = 0;
        long averageSumPerMonth = calculateAverageSalesPerMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSumPerMonth) {
                monthCounter++;
            }
        }
        return monthCounter;
    }
}

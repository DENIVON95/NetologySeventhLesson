package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    private static final long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    public void shouldCalculateCorrectSalesSum() {
        long expectedSum = 180;
        long actualSum = service.calculateSalesSum(sales);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCalculateCorrectAverageSalesSum() {
        long expectedAverageSales = 15;
        long actualAverageSales = service.calculateAverageSalesPerMonth(sales);
        assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void shouldFindCorrectMonthWithMaxSales() {
        int expectedMonthNumber = 8;
        int actualMonthNumber = service.getMaxSalesMonth(sales);
        assertEquals(expectedMonthNumber, actualMonthNumber);
    }

    @Test
    public void shouldFindCorrectMonthWithMinSales() {
        int expectedMonthNumber = 9;
        int actualMonthNumber = service.getMinSalesMonth(sales);
        assertEquals(expectedMonthNumber, actualMonthNumber);
    }

    @Test
    public void shouldCalculateCorrectAmountOfMonthsWithSalesAboveAverage() {
        int expectedMonthsAmount = 5;
        int actualMonthsAmount = service.getMonthsNumberWithSalesAboveAverage(sales);
        assertEquals(expectedMonthsAmount, actualMonthsAmount);
    }

    @Test
    public void shouldCalculateCorrectAmountOfMonthsWithSalesBelowAverage() {
        int expectedMonthsAmount = 5;
        int actualMonthsAmount = service.getMonthsNumberWithSalesBelowAverage(sales);
        assertEquals(expectedMonthsAmount, actualMonthsAmount);
    }
}

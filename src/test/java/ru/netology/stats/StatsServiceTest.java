package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test // Сумма всех продаж
    public void shouldSumAllSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.sumAllSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test //Средняя сумма продаж в месяц
    public void shouldAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.averageSales(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test  //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public void shouldMaxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.maxSales(sales);
        long expected = 9 ;
        Assertions.assertEquals(expected, actual);
    }

    @Test    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public void shouldMinSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.minSales(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test   //Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public void shouldBelowAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.belowAverageSales(sales);
        long expected = 5 ;
        Assertions.assertEquals(expected, actual);
    }

    @Test //Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public void shouldAboveAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.aboveAverageSales(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);

    }
}
package ru.netology.stats;

public class StatsService {
    // Сумма всех продаж
    public long sumAllSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    //Средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        return sumAllSales(sales) / 12;
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int belowAverageSales(long[] sales) {
        int belowAvrSales = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                belowAvrSales++;
            }
        }
        return belowAvrSales;
    }

    //Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int aboveAverageSales(long[] sales) {
        int aboveAvrSales = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                aboveAvrSales++;
            }
        }
        return aboveAvrSales;
    }
}




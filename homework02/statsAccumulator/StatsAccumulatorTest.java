package homework02.statsAccumulator;

public class StatsAccumulatorTest {
    public static void main(String[] args) {
        StatsAccumulator statsAccumulator = new StatsAccumulatorImpl(); // как то создается
        statsAccumulator.add(1);
        statsAccumulator.add(2);
        System.out.println(statsAccumulator.getAvg()); // 1.5 - среднее арифметическое элементов

        statsAccumulator.add(0);
        System.out.println(statsAccumulator.getMin()); // 0 - минимальное из переданных значений

        statsAccumulator.add(3);
        statsAccumulator.add(8);
        System.out.println(statsAccumulator.getMax()); // 8 - максимальный из переданных
        System.out.println(statsAccumulator.getCount()); // 5 - количество переданных элементов
    }
}

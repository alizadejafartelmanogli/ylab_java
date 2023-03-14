package homework02.statsAccumulator;

public class StatsAccumulatorImpl implements StatsAccumulator {

    private int min;
    private int max;
    private int count;
    private double avg;
    private double sum;

    @Override
    public void add(int value) {
        if (value < this.min) {
            this.min = value;
        } else if (value > this.max) {
            this.max = value;
        }
        this.count++;
        this.avg = (this.sum += value) / this.count;
    }

    @Override
    public int getMin() {
        return this.min;
    }

    @Override
    public int getMax() {
        return this.max;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public Double getAvg() {
        return this.avg;
    }
}

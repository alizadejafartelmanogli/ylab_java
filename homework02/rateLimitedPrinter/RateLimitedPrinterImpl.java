package homework02.rateLimitedPrinter;

public class RateLimitedPrinterImpl implements RateLimitedPrinterGenerator {
    private int interval;
    private long currentTimeStart;

    public RateLimitedPrinterImpl(int interval) {
        this.interval = interval;
    }

    @Override
    public void print(String message) {
        if ((System.currentTimeMillis() - this.currentTimeStart) > this.interval) {
            System.out.println(message);
            this.currentTimeStart = System.currentTimeMillis();
        }
    }
}

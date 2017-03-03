package 策略模式;

import java.math.BigDecimal;

/**
 * Created by zeject on 2017/3/3.
 */
public class Context {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public double cul(double consumePrice) {
        double realPrice = this.strategy.realPrice(consumePrice);
        BigDecimal bd = new BigDecimal(realPrice);
        bd = bd.setScale(1, BigDecimal.ROUND_DOWN);
        return bd.doubleValue();
    }
}

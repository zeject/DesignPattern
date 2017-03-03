package 策略模式;

/**
 * Created by zeject on 2017/3/3.
 */

/**
 * 八折商品促销策略
 */
public class RebateStrategy implements IStrategy {

    private final double rate;

    public RebateStrategy() {
        this.rate = 0.8;
    }

    @Override
    public double realPrice(double consumePrice) {
        return consumePrice * this.rate;
    }
}

package 策略模式;

/**
 * Created by zeject on 2017/3/3.
 */

/**
 * 满200,高于200部分打8折
 */
public class PromotionalStrategy implements IStrategy {
    @Override
    public double realPrice(double consumePrice) {
        if (consumePrice > 200) {
            return 200 + (consumePrice - 200) * 0.8;
        } else {
            return consumePrice;
        }
    }
}

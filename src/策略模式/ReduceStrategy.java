package 策略模式;

/**
 * Created by zeject on 2017/3/3.
 */

/**
 * 满1000 减200 商品促销策略
 */
public class ReduceStrategy implements IStrategy {

    @Override
    public double realPrice(double consumePrice) {
        if (consumePrice >= 1000) {
            return consumePrice - 200;
        } else {
            return consumePrice;
        }
    }
}

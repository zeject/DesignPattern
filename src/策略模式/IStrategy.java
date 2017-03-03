package 策略模式;

/**
 * Created by zeject on 2017/3/3.
 */
public interface IStrategy {
    /**
     * 计算实际价格方法
     *
     * @param consumePrice
     * @return
     */
    public double realPrice(double consumePrice);
}

package 策略模式;

import java.util.Random;

/**
 * Created by zeject on 2017/3/3.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(3);
            double consumePrice = 0;
            while ((consumePrice = random.nextInt(2000)) == 0) {

            }
            switch (x) {
                case 0:
                    context.setStrategy(new RebateStrategy());
                    break;
                case 1:
                    context.setStrategy(new PromotionalStrategy());
                    break;
                case 2:
                    context.setStrategy(new ReduceStrategy());
                    break;
            }
            System.out.println((x == 0 ? "8折" : (x == 1 ? "高于200部分8折" : (x == 2 ? "满1000减200" : ""))));
            System.out.println("原价" + consumePrice + "- 优惠后的价格:" + context.cul(consumePrice));
        }
    }
}

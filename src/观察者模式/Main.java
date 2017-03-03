package 观察者模式;

import java.util.Random;

/**
 * Created by zeject on 2017/3/3.
 */
public class Main {
    public static void main(String[] args) {
        ISubject subject = new Subject();

        subject.add(new PersonObserver());
        subject.add(new GovernmentObserver());
        Random random = new Random();

        int i = 0;
        while (++i < 10) {
            subject.setTemperature(random.nextInt(45));
        }
    }
}

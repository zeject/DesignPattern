package 观察者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class PersonObserver implements IObserver {
    @Override
    public void update(ISubject subject) {
        System.out.println("个人收到高温预警" + subject.temperatureReport());
    }
}

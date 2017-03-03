package 观察者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class GovernmentObserver implements IObserver {
    @Override
    public void update(ISubject subject) {
        System.out.println("政府收到高温预警:" + subject.temperatureReport());
    }
}

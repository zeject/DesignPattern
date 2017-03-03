package 观察者模式;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by zeject on 2017/3/3.
 */
public class Subject implements ISubject {

    private float temperature;

    private String warningLevel;

    private Vector<IObserver> vector;

    public Subject() {
        vector = new Vector<IObserver>();
    }

    @Override
    public boolean add(IObserver observer) {
        if (observer != null && !vector.contains(observer)) {
            return vector.add(observer);
        }
        return false;
    }

    @Override
    public boolean remove(IObserver observer) {
        return vector.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        System.out.println("======气象部门发布高温" + this.warningLevel + "警报!=======");
        Iterator<IObserver> iterator = vector.iterator();
        while (iterator.hasNext()) {
            iterator.next().update(this);
        }
    }

    private void invoke() {
        if (this.temperature >= 35) {
            if (this.temperature >= 35 && this.temperature < 37) {
                this.warningLevel = "黄色";
            } else if (this.temperature >= 37 && this.temperature < 40) {
                this.warningLevel = "橙色";
            } else if (this.temperature >= 40) {
                this.warningLevel = "红色";
            }
            this.notifyAllObserver();
        }
    }

    @Override
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        this.invoke();
    }

    @Override
    public String temperatureReport() {
        return "温度:" + this.temperature;
    }
}

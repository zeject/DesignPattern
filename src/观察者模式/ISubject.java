package 观察者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public interface ISubject {
    boolean add(IObserver observer);

    boolean remove(IObserver observer);

    /**
     * 通知所有观察者更新数据
     */
    void notifyAllObserver();

    /**
     * 设置温度值
     *
     * @param temperature
     */
    void setTemperature(float temperature);

    /**
     * 获得温度预警
     *
     * @return
     */
    String temperatureReport();
}

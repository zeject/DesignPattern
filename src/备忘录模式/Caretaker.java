package 备忘录模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class Caretaker {

    private INarrowMemento memento;

    public INarrowMemento getMemento() {
        return memento;
    }

    public void setMemento(INarrowMemento memento) {
        this.memento = memento;
    }
}

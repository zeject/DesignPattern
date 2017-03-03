package 备忘录模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class Memento implements INarrowMemento {

    private int blood;

    private int sword;

    public Memento(int blood, int sword) {
        this.blood = blood;
        this.sword = sword;
    }

    public int getBlood() {
        return blood;
    }

    public int getSword() {
        return sword;
    }
}

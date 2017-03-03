package 备忘录模式;

import java.util.Random;

/**
 * Created by zeject on 2017/3/3.
 */
public class Hero {

    private int blood;

    private int sword;

    private final Random random = new Random();

    public Hero() {
        this.blood = 100;
        this.sword = 100;
    }

    public INarrowMemento createMemento() {
        System.out.println("创建备忘录...");
        return new Memento(this.blood, this.sword);
    }

    public void restoreFromMemento(INarrowMemento memento) {
        System.out.println("恢复备忘录中的状态");
        if (memento != null) {
            Memento memento2 = (Memento) memento;
            this.blood = memento2.getBlood();
            this.sword = memento2.getSword();
        }
    }

    public int koBoss() {
        if (this.blood <= 0 || this.sword <= 0) {
            System.out.println(this.toString());
            System.out.println("挑战boss失败");
            return -1;
        } else {
            double win = Math.random();
            if (win <= 0.02) {
                System.out.println(this.toString());
                System.out.println("恭喜,挑战成功!");
                return 1;
            } else {
                System.out.println(this.toString());
                System.out.println("继续攻击boss");
                int blood_sub = random.nextInt(10);
                int sword_sub = random.nextInt(10);
                this.blood -= blood_sub;
                this.sword -= sword_sub;
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "blood=" + blood +
                ", sword=" + sword +
                '}';
    }
}

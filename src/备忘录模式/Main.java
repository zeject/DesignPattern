package 备忘录模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();

        Caretaker caretaker = new Caretaker();

        caretaker.setMemento(hero.createMemento());

        int cnt = 1;
        int ko = -1;
        while (ko != 1 && cnt <= 3) {
            System.out.println("第 " + cnt + " 次挑战==============");
            ko = hero.koBoss();
            while (true) {
                if (ko == -1) {
                    hero.restoreFromMemento(caretaker.getMemento());
                    cnt += 1;
                    break;
                } else if (ko == 0) {
                    ko = hero.koBoss();
                } else if (ko == 1) {
                    break;
                }
            }
        }
    }
}

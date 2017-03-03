package 模板方法模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class Main {
    public static void main(String[] args) {
        AbstractPeople peopleA = new PeopleA();
        AbstractPeople peopleB = new PeopleB();

        peopleA.dayLift();
        peopleB.dayLift();
    }
}

package 模板方法模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class PeopleA extends AbstractPeople {
    @Override
    protected void haveBreakfast() {
        System.out.println("不吃饭");
    }

    @Override
    protected void transport() {
        System.out.println("步行");
    }
}

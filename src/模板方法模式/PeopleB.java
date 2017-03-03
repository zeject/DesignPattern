package 模板方法模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class PeopleB extends AbstractPeople {
    @Override
    public void getUp() {
        super.getUp();
        System.out.println("不叠被子");
    }

    @Override
    protected void haveBreakfast() {
        System.out.println("吃饼子");
    }

    @Override
    protected void transport() {
        System.out.println("开车");
    }
}

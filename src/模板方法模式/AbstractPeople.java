package 模板方法模式;

/**
 * Created by zeject on 2017/3/3.
 */
public abstract class AbstractPeople {

    public void getUp() {
        System.out.println("起床...");
    }

    /**
     * 吃早餐方法
     */
    protected abstract void haveBreakfast();

    /**
     * 乘坐交通工具
     */
    protected abstract void transport();

    /**
     * 工作方法
     */
    public void doWork() {
        System.out.println("工作...");
    }

    public final void dayLift() {
        System.out.println("=============");
        getUp();
        haveBreakfast();
        transport();
        doWork();
        System.out.println("=============");
    }
}

package 访问者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class Employees extends Staff {

    public Employees(String no, String name, String position, float salary) {
        super(no, name, position, salary);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void add(Staff staff) {
        return;
    }

    @Override
    public Staff remove(String no) {
        return null;
    }
}

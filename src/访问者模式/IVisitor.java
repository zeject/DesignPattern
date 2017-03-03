package 访问者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public interface IVisitor {
    void visit(Manager manager);

    void visit(Employees employees);
}

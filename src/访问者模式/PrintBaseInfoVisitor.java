package 访问者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class PrintBaseInfoVisitor implements IVisitor {
    @Override
    public void visit(Manager manager) {
        System.out.println("-管理者: ");
        manager.printUserBaseInfo();
    }

    @Override
    public void visit(Employees employees) {
        System.out.println("- 一般员工: ");
        employees.printUserBaseInfo();
    }
}

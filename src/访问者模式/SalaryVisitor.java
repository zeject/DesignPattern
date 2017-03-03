package 访问者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class SalaryVisitor implements ISalaryVisitor {

    private float managerSalary;
    private float employessSalary;

    public SalaryVisitor() {
        managerSalary = 0;
        employessSalary = 0;
    }

    @Override
    public void visit(Manager manager) {
        managerSalary += manager.getSalary();
    }

    @Override
    public void visit(Employees employees) {
        employessSalary += employees.getSalary();
    }

    @Override
    public void printManagerTotalSalary() {
        System.out.println("一般员工薪资总和: " + employessSalary);
    }

    @Override
    public void printEmployeesTotalSalary() {
        System.out.println("管理者薪资总和: " + managerSalary);
    }

    @Override
    public void printTotalSalary() {
        System.out.println("员工薪资总和: " + (managerSalary + employessSalary));
    }
}

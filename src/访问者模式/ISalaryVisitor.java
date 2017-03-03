package 访问者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public interface ISalaryVisitor extends IVisitor {

    // 统计管理者薪资情况
    void printManagerTotalSalary();

    // 统计一般员工薪资情况
    void printEmployeesTotalSalary();

    // 统计所有员工薪资情况
    void printTotalSalary();

}

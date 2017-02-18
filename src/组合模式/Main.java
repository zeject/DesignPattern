package 组合模式;

public class Main {
	public static void main(String[] args) {
		// 公司CEO
		Staff boss = new Manager("1", "Boss", "ceo", 1000000);

		Staff financeManager = new Manager("11", "张", "财务部精力", 66666);

		Staff techicalManager = new Manager("12", "李", "人事部总经理", 66666);

		Staff techical = new Manager("1201", "王助理", "人事部助理", 66666);

		Staff dep = new Manager("1202", "陆主管", "人事部主管", 66666);

		Staff popel1 = new Employees("1202001", "同事1", "员工", 1000);
		Staff popel2 = new Employees("1202002", "同事2", "员工", 1000);
		Staff popel3 = new Employees("1202003", "同事3", "员工", 1000);

		dep.add(popel1);
		dep.add(popel2);
		dep.add(popel3);

		techicalManager.add(techical);
		techicalManager.add(dep);

		boss.add(financeManager);
		boss.add(techicalManager);

		boss.printUserBaseInfo();
		boss.printEmployeesInfo(0);

	}
}

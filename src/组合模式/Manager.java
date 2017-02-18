package 组合模式;

import java.util.ArrayList;

public class Manager extends Staff {

	private ArrayList<Staff> arrayList = new ArrayList<Staff>();

	public Manager(String no, String name, String position, float salary) {
		super(no, name, position, salary);
	}

	@Override
	public void add(Staff staff) {
		this.arrayList.add(staff);
	}

	@Override
	public void printEmployeesInfo(int layer) {
		int tmpLayer = ++layer;
		for (int i = 0; i < this.arrayList.size(); i++) {
			if (this.arrayList.get(i) == null) {
				continue;
			}
			printChar(tmpLayer);
			this.arrayList.get(i).printUserBaseInfo();
			this.arrayList.get(i).printEmployeesInfo(tmpLayer);
		}
	}

}

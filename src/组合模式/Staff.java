package 组合模式;

public abstract class Staff {

	protected String no;

	protected String name;

	protected String position;

	protected float salary;

	public Staff(String no, String name, String position, float salary) {
		this.no = no;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public void printUserBaseInfo() {
		System.out.println(
				"Manager [no=" + no + ", name=" + name + ", position=" + position + ", salary=" + salary + "]");
	}

	public abstract void add(Staff staff);

	public abstract void printEmployeesInfo(int layer);

	public void printChar(int layer) {
		for (int i = 0; i < layer * 2; i++) {
			System.out.print("-");
		}
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}

package 访问者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public abstract class Staff {

    protected String no;

    protected String name;

    protected String position;

    protected float salary;

    private int length;

    public Staff(String no, String name, String position, float salary) {
        this.no = no;
        this.name = name;
        this.position = position;
        this.salary = salary;
        // 计算总字节长度
        this.length += (no == null || "".equals(no.trim())) ? 0 : no.getBytes().length;
        this.length += (name == null || "".equals(name.trim())) ? 0 : name.getBytes().length;
        this.length += (position == null || "".equals(position.trim())) ? 0 : position.getBytes().length;
        this.length += String.valueOf(salary).getBytes().length;
    }

    public void printUserBaseInfo() {
        System.out.println("-|" + this.no + " " + this.name + " " + this.position + " " + this.salary);
    }

    //接收访问者对象
    public abstract void accept(IVisitor visitor);

    public abstract void add(Staff staff);

    public abstract Staff remove(String no);

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

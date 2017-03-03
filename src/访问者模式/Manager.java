package 访问者模式;

import java.util.ArrayList;

/**
 * Created by zeject on 2017/3/3.
 */
public class Manager extends Staff {

    // 存储手下员工信息
    private final ArrayList<Staff> arrayList = new ArrayList<Staff>();

    public Manager(String no, String name, String position, float salary) {
        super(no, name, position, salary);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) == null) {
                continue;
            }
            this.arrayList.get(i).accept(visitor);
        }
    }

    @Override
    public void add(Staff staff) {
        this.arrayList.add(staff);
    }

    @Override
    public Staff remove(String no) {
        Staff staff = null;
        if (no != null && "".equals(no.trim())) {
            for (int i = 0; i < this.arrayList.size(); i++) {
                if (this.arrayList.get(i) == null) {
                    continue;
                }
                if (no.equals(this.arrayList.get(i).getNo())) {
                    staff = this.arrayList.remove(i);
                    break;
                }
            }
        }
        return staff;
    }
}

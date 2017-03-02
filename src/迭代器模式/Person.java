package 迭代器模式;

/**
 * Created by zeject on 2017/3/2.
 */
public class Person implements IPerson {

    private String name;

    private int age;

    private int sex;

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String getPersonInfo() {
        return this.name + "----" + this.age + "----" + (this.sex == 1 ? "男" : "女");
    }
}

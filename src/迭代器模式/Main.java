package 迭代器模式;

/**
 * Created by zeject on 2017/3/2.
 */
public class Main {

    public static void main(String[] args) {
        IPersonList personList = new PersonList();
        Itertator iterator = personList.iterator();
        while (iterator.hasNext()) {
            IPerson person = (IPerson) iterator.next();
            if (person != null) {
                System.out.println(person.getPersonInfo());
            }
        }
        System.out.println("----使用迭代器输出人员结束");
    }

}

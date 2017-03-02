package 迭代器模式;

import java.util.Random;

/**
 * Created by zeject on 2017/3/2.
 */
public class PersonList implements IPersonList {

    private final IPerson[] list = new IPerson[10];

    public PersonList() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            IPerson person = new Person("人员" + i, random.nextInt(30), random.nextInt(2));
            list[i] = person;
//     this.list.add(person);
        }
    }

    @Override
    public IPerson[] getPersonList() {
        return list;
    }

    @Override
    public Itertator iterator() {
        return new ArrPersonIterator(this.list);
    }
}

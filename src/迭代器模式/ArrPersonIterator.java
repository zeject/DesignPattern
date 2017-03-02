package 迭代器模式;

/**
 * Created by zeject on 2017/3/2.
 */
public class ArrPersonIterator implements Itertator {

    private final IPerson[] personList;

    private int index = -1;

    public ArrPersonIterator(IPerson[] personList) {
        this.personList = personList;
    }

    @Override
    public boolean hasNext() {
        return (this.personList == null ? false : (index < this.personList.length - 1));
    }

    @Override
    public Object next() {
        if (this.personList != null && (index < this.personList.length - 1)) {
            return this.personList[++index];
        }
        return null;
    }

    public Object remove() {
        if (this.personList != null) {
            IPerson person = this.personList[index];
            this.personList[index] = null;
            return person;
        }
        return null;
    }

}

package 迭代器模式;

/**
 * Created by zeject on 2017/3/2.
 */
public interface IPersonList {

    /**
     * 获得内部存储人员信息内容
     *
     * @return
     */
    IPerson[] getPersonList();

    /**
     * 迭代器
     *
     * @return
     */
    Itertator iterator();
}

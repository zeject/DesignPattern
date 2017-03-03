package 状态模式;


/**
 * Created by zeject on 2017/3/3.
 */
public interface IState {

    /**
     * 状态转换
     *
     * @param context
     * @param mode
     */
    void convertState(Context context, int mode);

    /**
     * 保存方法
     *
     * @param context
     */
    void save(Context context);


    /**
     * 修改方法
     * @param context
     */
    void modify(Context context);

    void add(Context context);

    void view(Context context);
}

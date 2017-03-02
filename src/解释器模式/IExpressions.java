package 解释器模式;

/**
 * 表达式接口
 * Created by zeject on 2017/3/2.
 */
public interface IExpressions {

    /**
     * 解析
     *
     * @param context
     */
    void parse(Context context);

    /**
     * 执行方法
     */
    void interpret();

}

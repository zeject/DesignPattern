package 解释器模式;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zeject on 2017/3/2.
 */
public class ListExpression implements IExpressions {

    private Context context;

    private final ArrayList<IExpressions> list = new ArrayList<IExpressions>();

    /**
     * 构造方法将带解析的context传入
     *
     * @param context
     */
    @Override
    public void parse(Context context) {
        this.context = context;
        // 在ListExpression解析表达始终,循环解释语句中的每一个单词
        // 直至终结符表达式或者异常情况退出
        while (true) {
            if (this.context.getCurrentToken() == null) {
                // 获取当前节点,如果为null,则表示缺少END表达式
                System.out.println("Error:缺少END");
                break;
            } else if (this.context.equalsWithCommand("END")) {
                this.context.next();
                break;
            } else {
                // 简历Command 表达式
                IExpressions expressions = new CommandExpression(this.context);
                list.add(expressions);
            }
        }
    }

    @Override
    public void interpret() {
        Iterator<IExpressions> iterator = list.iterator();
        while (iterator.hasNext()) {
            (iterator.next()).interpret();
        }
    }
}

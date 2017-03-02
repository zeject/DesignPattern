package 解释器模式;

/**
 * Created by zeject on 2017/3/2.
 */
public class CommandExpression implements IExpressions {

    private final Context context;
    private IExpressions expressions;

    public CommandExpression(Context context) {
        this.context = context;
        this.parse(this.context);
    }

    @Override
    public void parse(Context context) {
        // 判断当前命令类别,在此只对For和最原始命令进行区分
        if (this.context.equalsWithCommand("FOR")) {
            // 创建For 表达式进行解析
            expressions = new ForExpression(this.context);
        } else {
            // 创建原始命令表达式进行内容解析
            expressions = new PrimitiveExpression(this.context);
        }
    }

    @Override
    public void interpret() {
        this.expressions.interpret();
    }
}

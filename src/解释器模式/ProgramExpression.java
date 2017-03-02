package 解释器模式;

/**
 * Created by zeject on 2017/3/2.
 */
public class ProgramExpression implements IExpressions {

    // 上下文环境
    private final Context context;

    // 当前命令
    private final static String COMMAND = "PROGRAM";

    // 存储下一个表达式
    private IExpressions expressions;

    public ProgramExpression(String text) {
        this.context = new Context(text);
        this.parse(context);
    }

    @Override
    public void parse(Context context) {
        this.context.next();
    }

    @Override
    public void interpret() {
        if (!this.context.equalsWithCommand(COMMAND)) {
            System.out.println("the '" + COMMAND + "' is Excepted For Start!");
        } else {
            // 是以PROGRAM开始
            this.context.next();
            this.expressions = new ListExpression();
            this.expressions.parse(this.context);
            // ListExpression表达式开始解析
            this.expressions.interpret();
        }
    }
}

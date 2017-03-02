package 解释器模式;

/**
 * Created by zeject on 2017/3/2.
 */
public class ForExpression implements IExpressions {

    private final Context context;

    // 存储当前索引key值
    private String variable;
    // 存储循环起始位置
    private int start_index;
    // 存储循环结束位置
    private int end_index;

    private IExpressions expressions;

    public ForExpression(Context context) {
        this.context = context;
        this.parse(this.context);
    }

    @Override
    public void parse(Context context) {
        this.context.next();
        while (true) {
            if (this.context.equalsWithCommand("FROM")) {
                String nextStr = this.context.next();
                try {
                    this.start_index = Integer.parseInt(nextStr);
                } catch (Exception e) {
                    System.out.println("ERROR: ===");
                    break;
                }
                this.context.next();
            } else if (this.context.equalsWithCommand("TO")) {
                String nextStr = this.context.next();
                try {
                    this.end_index = Integer.parseInt(nextStr);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                this.context.next();
                break;
            } else {
                if (this.variable == null) {
                    this.variable = this.context.getCurrentToken();
                }
                this.context.next();
            }
        }
        this.expressions = new ListExpression();
        this.expressions.parse(this.context);
    }

    @Override
    public void interpret() {
        for (int x = this.start_index; x < this.end_index; x++) {
            this.context.put("" + this.variable, x);
            this.expressions.interpret();
        }
        this.context.clear("" + this.variable);
    }
}

package 解释器模式;

/**
 * Created by zeject on 2017/3/2.
 */
public class PrimitiveExpression implements IExpressions {
    private Context context;

    private String tokenName;

    private String text;

    public PrimitiveExpression(Context context) {
        this.parse(context);
    }

    @Override
    public void parse(Context context) {
        this.context = context;
        this.tokenName = this.context.getCurrentToken();
        this.context.next();
        if ("PRINTLN".equals(this.tokenName)) {
            this.text = this.context.getCurrentToken();
            this.context.next();
        }
    }

    @Override
    public void interpret() {
        if ("PRINTLN".equals(tokenName)) {
            System.out.println(this.context.getTokenContent(this.text));
        }
    }
}

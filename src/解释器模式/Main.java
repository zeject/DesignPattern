package 解释器模式;

/**
 * Created by zeject on 2017/3/2.
 */
public class Main {

    public static void main(String[] args) {
        String str = "PROGRAM PRINTLN start... FOR i FROM 90 TO 100 PRINTLN i END PRINTLN end... END";
        System.out.println("str:" + str);
        IExpressions expressions = new ProgramExpression(str);
        expressions.interpret();
    }

}

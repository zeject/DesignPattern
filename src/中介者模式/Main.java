package 中介者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class Main {

    public static void main(String[] args) {
        IMediator mediator = new ConcreteMediator();

        IUser userA = new UserA(mediator, "张三");
        IUser userB = new UserB(mediator, "李四");
        IUser userC = new UserC(mediator, "王五");
        System.out.println("===========");
        userA.sendMessage("大家好,我是张三");
        System.out.println("===========");
        userB.sendMessage("李四desu");
        System.out.println("===========");
        userC.sendMessage("王五desu");
    }

}

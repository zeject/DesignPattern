package 中介者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class UserC extends AbstractUser {
    public UserC(IMediator mediator, String name) {
        super(mediator, name);
        mediator.regist(this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("userC received message:" + message);
    }
}

package 中介者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class AbstractUser implements IUser {

    protected IMediator mediator;

    protected String name;

    protected String message;

    public AbstractUser(IMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {

    }

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println(this.name + "talk:" + this.message);
        mediator.notifyAllMessage(this);
    }

    @Override
    public String getMessage() {
        return message;
    }
}

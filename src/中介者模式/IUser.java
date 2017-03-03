package 中介者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public interface IUser {

    /**
     * 接受消息
     *
     * @param message
     */
    void receiveMessage(String message);

    void sendMessage(String message);

    String getMessage();

}

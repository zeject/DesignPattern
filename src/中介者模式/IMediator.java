package 中介者模式;

/**
 * Created by zeject on 2017/3/3.
 */
public interface IMediator {

    /**
     * 注册用户信息
     *
     * @param user
     */
    void regist(IUser user);

    /**
     * 发送消息给所有人
     *
     * @param user
     */
    void notifyAllMessage(IUser user);

}

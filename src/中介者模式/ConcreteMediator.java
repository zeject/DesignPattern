package 中介者模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zeject on 2017/3/3.
 */
public class ConcreteMediator implements IMediator {

    private final List<IUser> list = new ArrayList<IUser>();

    @Override
    public void regist(IUser user) {
        if (user != null && !list.contains(user)) {
            list.add(user);
        }
    }

    @Override
    public void notifyAllMessage(IUser user) {
        Iterator<IUser> iterator = list.iterator();
        IUser tmpUser = null;
        while (iterator.hasNext()) {
            tmpUser = iterator.next();
            if (tmpUser != null && !tmpUser.equals(user)) {
                // 排除发送消息用户
                tmpUser.receiveMessage(user.getMessage());
            }
        }
    }
}

package 状态模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class PreviewState implements IState {
    @Override
    public void convertState(Context context, int mode) {
        if (mode == Context.EDIT_MODE) {
            context.changeState(new EditState());
        }
    }

    @Override
    public void save(Context context) {
        System.out.println("预览模式不支持 save...");
    }

    @Override
    public void modify(Context context) {
        System.out.println("预览模式不支持 modify...");
    }

    @Override
    public void add(Context context) {
        System.out.println("预览模式不支持 add...");
    }

    @Override
    public void view(Context context) {
        System.out.println("预览模式view...");
    }
}

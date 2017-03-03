package 状态模式;

/**
 * Created by zeject on 2017/3/3.
 */
public class EditState implements IState {
    @Override
    public void convertState(Context context, int mode) {
        if (mode == Context.PREVIEW_MODE) {
            context.changeState(new PreviewState());
        }
    }

    @Override
    public void save(Context context) {
        System.out.println("编辑模式 save...");
    }

    @Override
    public void modify(Context context) {
        System.out.println("编辑模式 modify...");
    }

    @Override
    public void add(Context context) {
        System.out.println("编辑模式 add...");
    }

    @Override
    public void view(Context context) {
        System.out.println("编辑模式 view...");
    }
}

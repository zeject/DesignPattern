package 命令模式;

public class Post implements IPost {

	// 收信人对象实例
	private final IReceiver receiver;

	public Post(IReceiver receiver) {
		this.receiver = receiver;
	}

	/**
	 * 邮局发送信件
	 */
	@Override
	public void sendMail(String message) {
		// TODO Auto-generated method stub
		System.out.println("邮局将信件发送给收信人");
		this.receiver.readMail(message);
	}

}

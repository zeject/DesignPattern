package 命令模式;

public class Main {

	public static void main(String[] args) {
		// 创建一个收信人对象实例
		IReceiver receiver = new Receiver();
		// 创建一个邮局对象实例,传入收信人对象实例
		IPost post = new Post(receiver);
		// 创建一个发信人对象实例,传入邮局对象实例
		Invoker invoker = new Invoker();
		invoker.setPost(post);
		invoker.postMail("发送一封邮件");
	}

}

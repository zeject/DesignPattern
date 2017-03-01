package 命令模式;

public class Invoker {

	private IPost post;

	public void setPost(IPost post) {
		this.post = post;
	}

	public void postMail(String message) {
		System.out.println("发信人投递信件给邮局");
		this.post.sendMail(message);
	}

}
